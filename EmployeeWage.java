package com.bl.emplyoeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day:" + totalWorkingDays + " Emp Hr:" + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHr;
	}

	public String toString() {
		return ("Total emp Wage for company :" + company + " is: " + totalEmpWage);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Builder Program For Multiple companies ");
		 System.out.println("\n Welcome to EmployeeWage builder \n");
	        EmployeeWage dMart = new EmployeeWage("TCS", 20, 20, 100);
	        EmployeeWage reliance = new EmployeeWage("Accenture", 10, 20, 110);
	        dMart.computeEmpWage();
	        System.out.println(dMart);
	        reliance.computeEmpWage();
	        System.out.println(reliance);
	    }
	}

