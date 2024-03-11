package com.lovely.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lovely.dto.EmployeeDto;

public class Dao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();//read the hibernate.cfg.xml file for established the connection
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	
		//fetch
//		Query query=session.createQuery("from EmployeeDto");
//	    List <EmployeeDto>list =query.list();
//	    for(EmployeeDto dto:list){
//	    	System.out.println(dto.getName()+" "+dto.getSalary()+" "+dto.getId()+" "+dto.getDesignation());
//	    	
//	    }
		//update
//		Transaction transaction=session.beginTransaction();
//		Query query=session.createQuery("update EmployeeDto  set salary=salary+?0 where id=?101" );
//		query.setDouble(0, 1000);
//		query.setInteger(1, 101);
//		query.executeUpdate();
		//transaction.commit();
		
	    session.close();

	}

}
