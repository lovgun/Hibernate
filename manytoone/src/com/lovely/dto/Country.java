package com.lovely.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class Country {
	@Id
	@GenericGenerator(name = "auto", strategy= "increment")
	@GeneratedValue(generator="auto")
	private int cnid;
	private String cname;
	
	
	
	

}
