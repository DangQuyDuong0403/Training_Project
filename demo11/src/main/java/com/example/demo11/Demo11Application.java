package com.example.demo11;

import com.example.demo11.repository.UserRepository;
import com.example.demo11.repository.HobbyRepository;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo11Application {
	private static final Logger log = LoggerFactory.getLogger(Demo11Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
	}

	@Resource
	HobbyRepository hobbyRepository;
	UserRepository userRepository;

	@Bean
	@ConditionalOnProperty(prefix = "app", name = "db.init.enabled", havingValue = "true")
	public CommandLineRunner demoCommandLineRunner() {
		return args -> {

			System.out.println("Running.....");
//
//			User u1 = User.builder()
//					.id(1)
//					.dob(LocalDateTime.now())
//					.email("abc@abc.abc")
//					.address("BG")
//					.description("ansc")
//					.first_name("Duong")
//					.last_name("Dang")
//					.phone_number("09880")
//					.build();
//

		};
	}
}