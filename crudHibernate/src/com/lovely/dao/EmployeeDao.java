package com.lovely.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.lovely.Dto.EmployeeDto;

public class EmployeeDao {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		//create or save or Insert
		EmployeeDto dto=new EmployeeDto();
		dto.setId(102);
		dto.setName("Lovely");
		dto.setDesignation("Developer");
		dto.setSalary(45000.00);
		session.save(dto);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
		//Read or fetch
//		EmployeeDto dto=session.load(EmployeeDto.class, 101);
//		System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getSalary()+" "+dto.getDesignation());
//		
//		Transaction transaction=session.beginTransaction();
//		transaction.commit();
//		session.close();
		
//		//update
//		EmployeeDto dto=session.load(EmployeeDto.class, 102);
//		dto.setSalary(dto.getSalary()+1000);
//		Transaction transaction=session.beginTransaction();
//		transaction.commit();
//		session.close();
//		
//		//delete
//		EmployeeDto dto=session.load(EmployeeDto.class, 102);
//		session.delete(dto);
//		Transaction transaction=session.beginTransaction();
//		transaction.commit();
//		session.close();
//		
		
	}

}
