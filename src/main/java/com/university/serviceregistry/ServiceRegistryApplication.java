package com.university.serviceregistry;

import java.util.Collections;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//testt

@SpringBootApplication
@EnableEurekaServer
@RestController
public class ServiceRegistryApplication {
	@GetMapping("/message")
	public String getMessage() {
		return " ServiceRegistryApplication starts after pulling from  DockerHub!!";
	}
	@GetMapping("/test")
	public String test() {
		return " test ....";
	}
	
	@GetMapping("/messageKubernetes")
	public String getMessageKubernetes() {
		return " Congratulations you have successfully deployed your application to kubernetes";
	}
	
	
	    public static void main(String[] args) {
	        SpringApplication app = new SpringApplication(ServiceRegistryApplication.class);
	        app.setDefaultProperties(Collections.singletonMap("server.port", "8761"));
	        app.run(args);
	    }
	}

