package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getConsumeData")  
	public String addData()
	{
		String url = "http://zuul/pcl/getProduceData";
		String data = rt.getForObject(url, String.class);
		return data;
		
	}
	

}
