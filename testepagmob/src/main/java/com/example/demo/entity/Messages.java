package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Messages {
	
	private String text;
	private Long ts;
	private Integer companyId;
	private String companyType;
	private String companyName;
	
}
