package br.com.mobilitas.ws;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import br.com.mobilitas.model.Employment;
import br.com.mobilitas.model.ResultEmployment;
import br.com.mobilitas.model.Vaga;

@Path("/employment")
public class EmploymentWS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRequests() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://sandbox.catho.com.br/v1/vagas");
			
		ResultEmployment resultEmployment = target.request(MediaType.APPLICATION_JSON)
				.header("Content-type", "application/json")
				.header("auth-Token", "yoon8WGF9cPt")
				.header("app-token", "Lxw8xmtkjs7w")
				.get(ResultEmployment.class);
		
		if(resultEmployment != null) {
			String latLongs[];
			try {
				
				ArrayList<Employment> employments = new ArrayList<Employment>();
				
				for(Vaga vaga : resultEmployment.get_embedded().getVagas()) {
					if(!vaga.getStatus().equals("DESATIVADA")) {
						latLongs = getLatLongPositions(vaga.getContratante().getNome());
						
						Employment employment = new Employment();
						employment.setLat(latLongs[0]);
						employment.setLng(latLongs[1]);
						employment.setId(vaga.getId());
						employment.setTitle(vaga.getTitulo());
						employment.setDescriptionCompany(vaga.getContratante().getNome());
						employment.setSalary(vaga.getSalario().getValor());
						employment.setRecruiterEmail(vaga.getRecrutadores().get(0).getEmail());
						employment.setActivities(vaga.getAtividades());
						
						employments.add(employment);
						
					}
				}
				
				return Response.status(200).entity(employments).build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return Response.status(400).entity("ERRO").build();
			}
		} else {
			return Response.status(400).entity("ERRO").build();
		}
		
		
	}

	public static String[] getLatLongPositions(String address) throws Exception {
		int responseCode = 0;
		String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8")
				+ "&sensor=true";
		URL url = new URL(api);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.connect();
		responseCode = httpConnection.getResponseCode();
		if (responseCode == 200) {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			;
			Document document = builder.parse(httpConnection.getInputStream());
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath.compile("/GeocodeResponse/status");
			String status = (String) expr.evaluate(document, XPathConstants.STRING);
			if (status.equals("OK")) {
				expr = xpath.compile("//geometry/location/lat");
				String latitude = (String) expr.evaluate(document, XPathConstants.STRING);
				expr = xpath.compile("//geometry/location/lng");
				String longitude = (String) expr.evaluate(document, XPathConstants.STRING);
				return new String[] { latitude, longitude };
			} else {
				throw new Exception("Error from the API - response status: " + status);
			}
		}
		return null;
	}

}
