package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cc")
public class Contact {
	
	
	private String address;
	
	@Value("dumm add")
	private String address2;
	
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
