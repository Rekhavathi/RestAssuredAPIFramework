package resources;

public enum APIResources {
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	DeletePlaceAPI("/maps/api/place/delete/json");
	private String resource;

	APIResources(String resource) {
		this.resource = resource;
		// TODO Auto-generated constructor stub
	}
	public String getResource()
	{
		return resource;
	}

}
