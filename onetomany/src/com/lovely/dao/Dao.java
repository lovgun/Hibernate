package com.lovely.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lovely.dto.studentDto;
import com.lovely.dto.teacherDto;

public class Dao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        studentDto st1=new studentDto();
        st1.setStudentName("lovely");
        studentDto st2=new studentDto();
        st2.setStudentName("jony");
        studentDto st3=new studentDto();
        st3.setStudentName("arun");
        List<studentDto>list=new ArrayList<studentDto>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        teacherDto t1=new teacherDto();
        t1.setTeacherName("Azam");
        t1.setList(list);
        session.save(t1);
        session.beginTransaction().commit();
   //fetch
//        teacherDto t1=session.load( teacherDto.class);
//        System.out.println("trainer name:"_+t1.getTeacherName());
//        List<studentDto>list1=t1.getList();
//        for(studentDto st1:list1){
//        	System.out.println("student name"+st1.getStudentName());
//        }
        
//delete
//      teacherDto t1=session.load( teacherDto.class,1);
//        session.delete(t1);
//        session.beginTransaction().commit();
        
        
        
       
	}

}
