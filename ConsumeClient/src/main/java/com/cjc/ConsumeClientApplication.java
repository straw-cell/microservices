package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeClientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rt() {
		RestTemplate rs= new RestTemplate ();
		 return rs;
		 
		
				
	}
}
