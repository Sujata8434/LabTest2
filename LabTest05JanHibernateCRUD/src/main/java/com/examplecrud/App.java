package com.examplecrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
//		StudentEntity s1 = new StudentEntity();
//		s1.setStu_id(1);
//		s1.setStu_name("Sujata");
//		s1.setStu_deprt("MCA");
//
//		StudentEntity s2 = new StudentEntity();
//		s2.setStu_id(2);
//		s2.setStu_name("Sneha");
//		s2.setStu_deprt("CS");
//
//		StudentEntity s3 = new StudentEntity();
//		s3.setStu_id(3);
//		s3.setStu_name("Smrity");
//		s3.setStu_deprt("IT");
//
//		StudentEntity s4 = new StudentEntity();
//		s4.setStu_id(4);
//		s4.setStu_name("Riya");
//		s4.setStu_deprt("BIO");
//
//		s.save(s1);
//		s.save(s2);
//		s.save(s3);
//		s.save(s4);
//		tr.commit();
//		System.out.println("Object save successfully.....");

		// update operation
//		StudentEntity stu = s.get(StudentEntity.class, 2);
//		stu.setStu_deprt("COM");
//		s.save(stu);

		// delete operation
//		StudentEntity stu = s.get(StudentEntity.class, 4);
//		s.delete(stu);

		// read opertaion
		StudentEntity stu = s.get(StudentEntity.class, 2);
		System.out.println(stu);
		tr.commit();
	}
}
