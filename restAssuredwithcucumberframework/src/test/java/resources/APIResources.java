package resources;

public enum APIResources 
{
	loginAPI("api/ecom/auth/login"),
	addProductAPI("api/ecom/product/add-product"),
	createOrderAPI("api/ecom/order/create-order"),
	getOrderAPI("api/ecom/order/get-orders-details");
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource = resource;
	}
	public String getResource()
	{
		return resource;
	}
}
