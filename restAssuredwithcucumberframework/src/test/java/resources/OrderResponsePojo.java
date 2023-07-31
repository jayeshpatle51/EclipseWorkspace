package resources;

import java.util.ArrayList;
import java.util.List;

public class OrderResponsePojo {

	private ArrayList<String> orders;
	private ArrayList<String> productOrderId;
	private String message;
	
	public ArrayList<String> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}
	public ArrayList<String> getProductOrderId() {
		return productOrderId;
	}
	public void setProductOrderId(ArrayList<String> productOrderId) {
		this.productOrderId = productOrderId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
