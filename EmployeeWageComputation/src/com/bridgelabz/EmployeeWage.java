package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		int isPresent = 1;
		int value = (int)Math.floor(Math.random()*10) % 2;
		if(value == isPresent) {
			System.out.println("Employee is Present");
		}
		else 
			System.out.println("Employee is Absent");	

	}
}
