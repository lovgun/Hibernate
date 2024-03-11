package com.lovely.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;
@Entity
@Data  //lombock used here
@ToString  //lombock used
public class teacherDto {
	@Id// MAKING PRIMARY KEY OF ID FIELD
	//for make id auto increment
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int teacherId;
	private String teacherName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="teacherId")
	private List<studentDto>list;
	
	
	
	

}
