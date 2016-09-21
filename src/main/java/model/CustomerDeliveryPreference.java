package model;

import java.util.List;

public  class CustomerDeliveryPreference{
	
	String status;
	List<DeliveryPreference> payload;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<DeliveryPreference> getPayload() {
		return payload;
	}
	public void setPayload(List<DeliveryPreference> payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		
		payload.forEach(System.out::println);
		return "ATG [status=" + status + "]";
	}
	
}
