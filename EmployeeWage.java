package com.bl.emplyoeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Builder Program For Multiple companies ");
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
	}
}
