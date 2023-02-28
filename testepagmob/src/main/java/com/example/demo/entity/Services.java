package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Services {
	
    private String routeCode;
    private String routeMnemonic;
    private Integer companyId;
    private Integer stopId;
    private Integer serviceId;
    private String serviceMnemonic;
    private String predictionType;
    private String predictionTime;
    private Integer activeVehicles;
    private Integer scheduledVehicles;
    private Boolean hasRealTime;
    private Messages[] messages;
    private Vehicles[] vehicles;
    
}
