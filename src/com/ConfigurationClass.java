package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

@Bean
public Contact contact(){
	System.out.println("---------------------------------getting contact ");
	return new Contact();
}

}
