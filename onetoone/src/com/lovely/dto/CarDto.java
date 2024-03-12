package com.lovely.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class CarDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	@OneToOne(cascade=CascadeType.ALL)
	private EngineDto engineDto;
	

	

}
