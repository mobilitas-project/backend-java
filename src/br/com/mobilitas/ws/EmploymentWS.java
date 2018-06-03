package br.com.mobilitas.ws;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.co.mobilitas.controller.EmploymentController;
import br.com.mobilitas.model.Employment;
import br.com.mobilitas.model.ResultEmployment;
import br.com.mobilitas.model.Vaga;

@Path("/employment")
public class EmploymentWS {

	EmploymentController employmentController;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getEmploymentByID(@PathParam("id") String id) {
		employmentController = new EmploymentController();
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://sandbox.catho.com.br/v1/vagas/" + id);
			
		Vaga vaga = target.request(MediaType.APPLICATION_JSON)
				.header("Content-type", "application/json")
				.header("auth-Token", "yoon8WGF9cPt")
				.header("app-token", "Lxw8xmtkjs7w")
				.get(Vaga.class);	
		
		if(vaga != null) {
			String latLongs[];
			try {
				latLongs = employmentController.getLatLongPositions(vaga.getContratante().getNome());
				
				Employment employment = new Employment();
				employment.setLat(latLongs[0]);
				employment.setLng(latLongs[1]);
				employment.setId(vaga.getId());
				employment.setTitle(vaga.getTitulo());
				employment.setDescriptionCompany(vaga.getContratante().getNome());
				employment.setSalary(vaga.getSalario().getValor());
				employment.setRecruiterEmail(vaga.getRecrutadores().get(0).getEmail());
				employment.setActivities(vaga.getAtividades());
				
				return Response.status(200).entity(employment).build();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return Response.status(400).entity("ERRO").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployments() {
		employmentController = new EmploymentController();
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://sandbox.catho.com.br/v1/vagas?pageSize=30");
			
		ResultEmployment resultEmployment = target.request(MediaType.APPLICATION_JSON)
				.header("Content-type", "application/json")
				.header("auth-Token", "yoon8WGF9cPt")
				.header("app-token", "Lxw8xmtkjs7w")
				.get(ResultEmployment.class);
		
		if(resultEmployment != null) {
			String latLongs[];
			try {
				ArrayList<Employment> employments = new ArrayList<Employment>();
				
				int count = 0 ;
				for(Vaga vaga : resultEmployment.get_embedded().getVagas()) {
					if(count > 2) {
						break;
					}
					if(!vaga.getStatus().equals("DESATIVADA")) {
						latLongs = employmentController.getLatLongPositions(vaga.getContratante().getNome());
						
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
					
					count ++;
				}
				
				return Response.status(200).entity(employments).build();
			} catch (Exception e) {
				e.printStackTrace();
				return Response.status(400).entity("ERRO").build();
			}
		} else {
			return Response.status(400).entity("ERRO").build();
		}	
	}

	

}
