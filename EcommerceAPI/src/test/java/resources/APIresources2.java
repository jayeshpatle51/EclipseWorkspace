package resources;

public enum APIresources2
{
	loginApi("api/ecom/auth/login"),
	addProductAPI("api/ecom/product/add-product"),
	createOrderAPI("/api/ecom/order/create-order"),
	getOrderAPI("api/ecom/order/get-orders-details");
	
	private String resource;
	
	APIresources2(String resource)
	{
		this.resource = resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	
			
}
