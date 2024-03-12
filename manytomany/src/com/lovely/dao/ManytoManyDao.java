package com.lovely.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lovely.dto.DoctorDto;
import com.lovely.dto.PatientDto;

public class ManytoManyDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
//        PatientDto p1=new PatientDto();
//        p1.setPname("arun");
//        PatientDto p2=new PatientDto();
//        p2.setPname("zaid");
//        PatientDto p3=new PatientDto();
//       
//        List<PatientDto>patientDtolist=new ArrayList<PatientDto>();
//        patientDtolist.add(p1);
//        patientDtolist.add(p2);
//        patientDtolist.add(p3);
//        
//        DoctorDto doctorDto=new DoctorDto();
//        doctorDto.setDname("alok");
//        doctorDto.setPatentList(patientDtolist);
//        
//        session.save(doctorDto);
//        session.beginTransaction().commit();
        DoctorDto d1=new DoctorDto();
        d1.setDname("lok");
        DoctorDto d2=new DoctorDto();
        d2.setDname("lokesh");
        List<DoctorDto>doc =Arrays.asList(d1,d2);
        PatientDto p1=new PatientDto();
        p1.setPname("a");
        
        p1.setDoctorDtos(doc);
        session.save(p1);
        session.beginTransaction().commit();
      
        
        
        
	}
	

}
