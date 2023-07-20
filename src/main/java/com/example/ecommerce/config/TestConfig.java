package com.example.ecommerce.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.ecommerce.entities.Category;
import com.example.ecommerce.entities.Order;
import com.example.ecommerce.entities.User;
import com.example.ecommerce.entities.enums.OrderStatus;
import com.example.ecommerce.repositories.CategoryRepository;
import com.example.ecommerce.repositories.OrderRepository;
import com.example.ecommerce.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null,"João Rodrigues", "joao@gmail.com", "85999999999", "123");
		User user2 = new User(null,"Bruno Freitas", "bruno@gmail.com", "85999999991", "123");
		
		Order order1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user1);
		Order order2 = new Order(null, Instant.parse("2023-07-19T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user1);
		Order order3 = new Order(null, Instant.parse("2023-07-20T21:21:22Z"), OrderStatus.WAITING_PAYMENT,user2);
		
		Category category1 = new Category(null, "Electronics");
		Category category2 = new Category(null, "Books");
		Category category3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(user1,user2));
		orderRepository.saveAll(Arrays.asList(order1,order2,order3));
		categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
	}

}
