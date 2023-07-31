package resources;

public enum Body 
{
	loginAPIBody("{\"userEmail\":\"d.gopimanohar@gmail.com\",\"userPassword\":\"Gopi@1234\"}"),
	createOrderApiBody("{\"orders\":[{\"country\":\"India\",\"productOrderedId\":\"****\"}]}");
	private String body;
	
	
	Body(String body)
	{
		this.body = body;
	}
	
	public String getBody()
	{
		return body;
	}
}
