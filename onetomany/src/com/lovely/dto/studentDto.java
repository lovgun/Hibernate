package com.lovely.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data

public class studentDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
}