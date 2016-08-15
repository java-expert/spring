package com;

import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {

	private int id;
	
	@Autowired
	@Qualifier("cc")
	private Contact cont;
	
	@Value("dummy")
	private String valInjectCheck;
	
	public String getValInjectCheck() {
		return valInjectCheck;
	}
	public void setValInjectCheck(String valInjectCheck) {
		this.valInjectCheck = valInjectCheck;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Contact getCont() {
		return cont;
	}
	public void setCont(Contact cont) {
		this.cont = cont;
	}
	

}
