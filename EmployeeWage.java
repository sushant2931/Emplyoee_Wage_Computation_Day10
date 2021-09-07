package com.bl.emplyoeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Builder Program For Multiple companies ");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("employee is present");
			empHrs = 8;
		} else {
			System.out.println("employee is absent");
			empHrs = 0;
		}
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage " + empWage);
	}
}
