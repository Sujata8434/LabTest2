package com.management.StudentManagement;

import java.util.Scanner;

import com.index.Index;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String u_name;
		String pass1;
		String uname = "SnehaKumari";
		String pass2 = "sneha123";
		System.out.println("***********************************************************************************");
		System.out.println("WELCOME TO OUR STUDENT MANAGEMENT");
		System.out.print("Enter User Name: \t");
		u_name = sc.next();
		System.out.print("Enter Password: \t");
		pass1 = sc.next();
		if (u_name.equals(uname) && pass1.equals(pass2)) {
			System.out.println("You logged in successfully'");
			Index in = new Index();
			in.index();
		} else {
			System.out.println("...Invalid User Name and Password....Please try again......");
		}

	}
}
