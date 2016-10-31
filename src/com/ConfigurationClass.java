package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

@Bean
public Contact contact(){
	System.out.println("---------------------------------getting contact ");
	Contact f=new Contact();
	f.setAddress("ddddddddddddddd");
	return f;
}

}
