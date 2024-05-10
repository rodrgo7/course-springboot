package com.oliveiradev.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oliveiradev.course.entities.Category;
import com.oliveiradev.course.entities.Order;
import com.oliveiradev.course.entities.User;
import com.oliveiradev.course.entities.enums.OrderStatus;
import com.oliveiradev.course.repositories.CategoryRepository;
import com.oliveiradev.course.repositories.OrderRepository;
import com.oliveiradev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Rodrigo Ol", "ro@gmail.com", "99999888888", "123456");
        User u2 = new User(null, "Fernanda Bzz", "fe@gmail.com", "8888889999", "654321");

        Order o1 = new Order(null, Instant.parse("2024-04-01T08:25:24.00Z"), OrderStatus.PAID, u1); // FORMATO DATA - ISO8601
        Order o2 = new Order(null, Instant.parse("2024-04-08T10:25:24.00Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2024-04-08T09:25:24.00Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computer");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}