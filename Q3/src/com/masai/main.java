package com.masai;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Car c1 = new Car();
		Engine e1= new Engine();
		
		c1.model="Harrier";
		c1.companyName="Tata";
		c1.Color="black";
		e1.rmp=10000;
		e1.manufacturer="Tata";
		e1.Power=110;
		e1.enableTurbo();
		System.out.println(c1);
		Car c2 = new Car();
		Engine e2= new Engine();
	}
}
