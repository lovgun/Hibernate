package com.lovely.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class DoctorDto {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int did;
	private String dname;
	
    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="doc_pat",joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="pid"))
    private List <PatientDto>patentList;
	
	
	

}
