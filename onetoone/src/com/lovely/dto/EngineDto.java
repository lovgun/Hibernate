package com.lovely.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EngineDto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int eid;
	private String ename;

}
