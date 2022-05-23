package com.masai;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	public void displayCourseDetails() {
		System.out.println("courseid is :"+courseId);
		System.out.println("coursename is:"+courseName);
		System.out.println("coursefees is :"+courseFee);
	}
	public static void authenticate(String username, String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Scanner scanner = new Scanner(System.in);
			Course c1 = new Course();
			c1.courseId =scanner.nextInt();
			c1.courseName=scanner.next();
			c1.courseFee= scanner.nextInt();
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		Course.authenticate("Admin", "1234");
		authenticate("ram", "4523");
	}
}
