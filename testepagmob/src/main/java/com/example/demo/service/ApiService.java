package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Services;
import com.example.demo.entity.ServicesWrapper;

@Service
public class ApiService {
	
	public List<Services> buscarServices() {
		  String url = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ServicesWrapper> resp = restTemplate
        		.getForEntity(url, ServicesWrapper.class);
        ServicesWrapper serviceWrapper = resp.getBody();
        return serviceWrapper.getServices();
		
	}

}
