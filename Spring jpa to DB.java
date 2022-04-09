package com.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class SpringbootwebApplication {
	
    
	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringbootwebApplication.class, args);
		
		UserRepository userRepository=Context.getbean(UserRepository.class);
	    User user=new User();
	    user.setName="Durgesh kumar";
	    user.setCity="Delhi";
	    user.setStatus="java Programmer";
	    User user1=UserRepository.save(user);
	    System.out.println(user1);
	}

}
