package com.example.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.ecommerce.entities.User;
import com.example.ecommerce.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(-1, "João Rodrigues", "joao@gmail.com", "85999999999", "123");
		User user2 = new User(-1, "Bruno Freitas", "bruno@gmail.com", "85999999991", "123");
		
		userRepository.saveAll(Arrays.asList(user1,user2));
	}
	
	
}
