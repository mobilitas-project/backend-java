package br.com.mobilitas.model;

public class ResultEmployment {

	private Link _links;
	private Vagas _embedded;
	private int page_count;
	private int page_size;
	private int total_items;
	private int page;
	
	public int getPage_count() {
		return page_count;
	}

	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}

	public int getPage_size() {
		return page_size;
	}

	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

	public int getTotal_items() {
		return total_items;
	}

	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Vagas get_embedded() {
		return _embedded;
	}

	public void set_embedded(Vagas _embedded) {
		this._embedded = _embedded;
	}

	public Link get_links() {
		return _links;
	}

	public void set_links(Link _links) {
		this._links = _links;
	}

	
}
