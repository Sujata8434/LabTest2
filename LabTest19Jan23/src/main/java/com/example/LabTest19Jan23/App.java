package com.example.LabTest19Jan23;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Book;
import com.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();
        
        Book b1=new Book();
        b1.setB_id(101);
        b1.setB_name("Bhagwat Gita");
        
        Book b2=new Book();
        b2.setB_id(102);
        b2.setB_name("Ramayana");
        
        Book b3=new Book();
        b3.setB_id(103);
        b3.setB_name("Hanuman Chalisha");
        
        List<Book> book=new ArrayList<>();
        book.add(b1);
        book.add(b2);
        book.add(b3);
        
        Student s1=new Student(1001, "Sakshi", "BCA", book);
        Student s2=new Student(1002, "Khushi", "BCM", book);
        Student s3=new Student(1003, "Raunak", "BTech", book);
        Student s4=new Student(1004, "Sujata", "MCA", book);
        Student s5=new Student(1005, "Dheeraj", "MTech", book);
        Student s6=new Student(1006, "Shanuaa", "IT", book);
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        s.save(s4);
        s.save(s5);
        s.save(s6);
        
        s.save(b1);
        s.save(b2);
        s.save(b3);
        
        tr.commit();
        System.out.println("Object Saved Sucessfully!!!!!");
          
       
    }
   
}
