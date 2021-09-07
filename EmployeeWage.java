package com.bl.emplyoeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Builder Program For Multiple companies ");
		int empHrs = 0;
		int empWage = 0;
		int totalWage = 0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingHrs < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			// Getting Random Number by Random method
			// Math.floor is used to Round off the value
			double empCheck = (Math.floor(Math.random() * 10) % 3);
			switch ((int) empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalWorkingHrs += empHrs;
			// Daily_wage checking based on emp_attendance
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage=" + empWage);
			// adding daily wage into total
			totalWage += empWage;

			System.out.println("total Working Hours=" + totalWorkingHrs);
			System.out.println("Total wage of Employee for 20days:" + totalWage);
		}
	}
}
