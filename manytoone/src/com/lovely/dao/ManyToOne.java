package com.lovely.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lovely.dto.City;
import com.lovely.dto.Country;

public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
	    Country country=new Country();
	    City city1=new City();
	    city1.setCname("delhi");
	    city1.setCountry(country);
	    session.save(city1);
	    City city2=new City();
	    city2.setCname("Mumbai");
	    city2.setCountry(country);
	    session.save(city2);
	    City city3=new City();
	    city3.setCname("kolkata");
	    city3.setCountry(country);
	    session.save(city3);
	    City city4=new City();
	    city4.setCname("Banglore");
	    city4.setCountry(country);
	    session.save(city4);
	    
	}

}
