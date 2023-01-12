package com.index;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentEntity;

public class Index {

	public void index() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any operation that you want to perform");
		System.out.println("\n1: Insert New Student Data");
		System.out.println("2: Read Student Data");
		System.out.println("3: Update Student Data");
		System.out.println("4: Delete Student Data");
		int ch = sc.nextInt();
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();

		switch (ch) {
		case 1:
			StudentEntity se1 = new StudentEntity();
			System.out.println("Enter student ID");
			se1.setStu_id(sc.nextInt());
			System.out.println("Enter Student Name");
			se1.setStu_name(sc.next());
			System.out.println("Enter Student Department");
			se1.setStu_dep(sc.next());
			System.out.println("Enter Student Contact");
			se1.setStu_contact(sc.next());
			s1.save(se1);
			tr.commit();
			System.out.println("Object saved");
			break;

		case 2:
			StudentEntity read = new StudentEntity();
			System.out.println("Enter Student ID");
			read = s1.load(StudentEntity.class, sc.nextInt());
			System.out.println(read);
			break;
		case 3:
			StudentEntity update = new StudentEntity();
			System.out.println("Update Student New Id");
			update.setStu_id(sc.nextInt());
			System.out.println("Update Student New Name");
			update.setStu_name(sc.next());
			System.out.println("Update Student New Department");
			update.setStu_dep(sc.next());
			System.out.println("Update Student New Contact");
			update.setStu_contact(sc.next());

			s1.save(update);
			tr.commit();
			break;
		case 4:
			StudentEntity delete = new StudentEntity();
			System.out.println("Deleted Student Id ");
			delete = s1.load(StudentEntity.class, sc.nextInt());
			s1.delete(delete);
//			s1.save(delete);
//			tr.commit();
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
