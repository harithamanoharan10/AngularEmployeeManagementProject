package com.microservice.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.ManagementEntity;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/microservice-api")
public class ManagementController {
	
	@Autowired
	RestTemplateBuilder restTemplateBuilder;
	
	//http://localhost:8089/microservice-api/get-all
	
	@GetMapping("/get-all")
	public List<ManagementEntity> getAll() {
		List<ManagementEntity> responseEntity = new ArrayList<ManagementEntity>();
		responseEntity = (List<ManagementEntity>) restTemplateBuilder.build().getForObject("http://localhost:8088/employee/api/employees", List.class);

	
		//creating a new response bean and getting the response back and taking it into Bean
		return responseEntity;
	}
	
	@GetMapping("/get-id/{empId}")
	public ManagementEntity getId(@PathVariable int empId) {
		ManagementEntity emp = restTemplateBuilder.build().getForObject("http://localhost:8088/employee/api/employees/" + empId, ManagementEntity.class);
		return emp;
	}

}
