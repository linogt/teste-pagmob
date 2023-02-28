package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Services;
import com.example.demo.service.ApiService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ApiController {
	
	@Autowired
	private ApiService apiService;
   

    @GetMapping("/services")
    public List<Services> getServices() {
    	return apiService.buscarServices();
    }
}
