package com.example.springbootcursor;

import com.example.springbootcursor.beanclasses.ConditionalBeanMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCursorApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCursorApplication.class, args);
//		SpringApplication.run returns ApplicationContext type
		ConditionalBeanMessage message = context.getBean(ConditionalBeanMessage.class);
		message.sendMessage();

	}

}
