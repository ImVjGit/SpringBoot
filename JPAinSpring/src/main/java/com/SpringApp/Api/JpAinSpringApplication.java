package com.SpringApp.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpAinSpringApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(JpAinSpringApplication.class);
		
		UserRepository uR = Context.getBean(UserRepository.class);
		User us = new User();
		us.setId(15);
		us.setName("Ram");
		us.setStatus("On");
		us.setCty("Pune");
		User user1 = uR.save(us);
		System.out.println(user1);
	}

}
