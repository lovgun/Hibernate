package com.lovely.hibernate_demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lovely.entity.EmployeeDto;

public class EmployeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();//read the hibernate.cfg.xml file for established the connection
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();//in short opening data base connection for db operations
		EmployeeDto dto=new EmployeeDto();
		dto.setId(101);
		dto.setName("Arun");
		dto.setDesignation("Developer");
		dto.setSalary(25000.00);
		session.save(dto);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
		session.close();
		factory.close();
		

	}

}
