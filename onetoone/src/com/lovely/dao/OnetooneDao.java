package com.lovely.dao;

import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lovely.dto.CarDto;
import com.lovely.dto.EngineDto;

public class OnetooneDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction =session.beginTransaction();
        EngineDto eng=new EngineDto();
        eng.setEname("PowerEngine");
        CarDto car=new CarDto();
        car.setCname("BMW");
        car.setEngineDto(eng);
        session.save(car);
        transaction.commit();
        
    
        

	}

}
