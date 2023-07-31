package resources;

public class APIBody 
{
	public String loginAPIBody()
	{
		String s = "{\"userEmail\":\"d.gopimanohar@gmail.com\",\"userPassword\":\"Gopi@1234\"}";
		return s;
	}
	
	public String createOrderApiBody(String pId)
	{
		String s= "{\"orders\":[{\"country\":\"India\",\"productOrderedId\":\""+pId+"\"}]}";
		return s;
	}
	
}
