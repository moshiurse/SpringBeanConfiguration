package edu.learning.springcore.beanconfig;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
	private Map<String, Address> addresses = new HashMap<String, Address>();

	public Map<String, Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Address> address : addresses.entrySet()) {
			sb.append(address.toString()+ "\n");
		}
		return sb.toString();
	}
	
	


}
