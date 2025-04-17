package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProduceController {

			
		@Value("${server.port}")
	     String port;
		
		@GetMapping("/getProduceData")
		public String addProduceData()
		{
			
			return "this is produce controller           "+port;
			
		}
		

	}



