package com.lovely.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Entity
@Data
public class City {
	@Id
	@GenericGenerator(name = "auto", strategy= "increment")
	@GeneratedValue(generator="auto")
	private int cid;
	private String cname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName ="cnid")
	private Country country;
}
