package com.lovely.dao;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.lovely.dto.loginDto;

public class loginDao {
	

	public static void main(String[] args) {
		String result;
		String user;
		String pass;
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Scanner sc =new Scanner(System.in);
		System.out.println("pls select any one login/registration");
		String value=sc.nextLine();
		
		if(value.equals("login")){
			
		System.out.println("enter username");
		user=sc.nextLine();
		System.out.println("enter password");
		pass=sc.nextLine();
		Query query=session.createQuery("from loginDto where username=:username and password=:password").setParameter("username", user).setParameter("password", pass);
		loginDto dto=(loginDto) query.uniqueResult();
		
		if(dto!=null){
			System.out.println(dto.getId()+" "+dto.getUsername()+" "+dto.getFullname()+" "+dto.getAddress());
			System.out.println("login successsful");
			transaction.commit();
			session.close();
			}
		                
		else{
			System.out.println("login failed plz try again from correct credential...");
		    }
		}
		
		
	                                
		else{
			cfg=new Configuration();
			cfg.configure();
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			System.out.println("enter username");
			String userName=sc.nextLine();
			System.out.println("enter fullname");
			String fullName=sc.nextLine();
			System.out.println("enetr password");
			String password=sc.nextLine();
			System.out.println("enter address");
			String address=sc.nextLine();
			loginDto dto=new loginDto();	
			dto.setUsername(userName);
			dto.setFullname(fullName);
			dto.setPassword(password);
            dto.setAddress(address);	
            session.save(dto);
            transaction= session.beginTransaction();
            transaction.commit();
            session.close();
            System.out.println("your data is saved");
		   }

	}
	
	
	
	
}



