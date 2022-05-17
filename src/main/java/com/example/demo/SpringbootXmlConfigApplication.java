package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.service.MessageProcessor;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class SpringbootXmlConfigApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootXmlConfigApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(SpringbootXmlConfigApplication.class, args);

		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
	}

}
