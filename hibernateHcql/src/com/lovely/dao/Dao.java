package com.lovely.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.lovely.dto.EmplyeeDto;

public class Dao {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();//read the hibernate.cfg.xml file for established the connection
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Criteria cr=session.createCriteria(EmplyeeDto.class);
		//cr.add(Restrictions.eq("designation", "Developer"));

		//cr.add(Restrictions.gt("salary", 2000.00));
		List<EmplyeeDto>list=cr.list();
		System.out.println("hello");
		System.out.println(list);
		for(EmplyeeDto dto:list){
			System.out.println(dto);
		}
		cr.addOrder(Order.asc("salary"));
		List<EmplyeeDto>list1=cr.list();
		for(EmplyeeDto dto:list1){
			System.out.println(dto);
	
			
		}
	session.close();
	}
}

