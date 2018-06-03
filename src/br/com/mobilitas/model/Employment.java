package br.com.mobilitas.model;

public class Employment {

	private String id;
	private String title;
	private String activities;
	private String lat;
	private String lng;
	private int salary;
	private String descriptionCompany;
	private String recruiterEmail;
	
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getDescriptionCompany() {
		return descriptionCompany;
	}
	public void setDescriptionCompany(String descriptionCompany) {
		this.descriptionCompany = descriptionCompany;
	}
	public String getRecruiterEmail() {
		return recruiterEmail;
	}
	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}
	
	
	
}
