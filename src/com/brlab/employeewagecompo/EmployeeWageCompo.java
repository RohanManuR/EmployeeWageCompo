package com.brlab.employeewagecompo;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageCompo {
    static final int WAGE_PER_HOUR = 20;
    static final int MAX_DAYS = 20;
    static final int MAX_HOURS = 100;

    int totalWage;
    public static void computeWage() {
        int totalWage = 0, totalHours = 0, totalDays = 0;

        while (totalDays < MAX_DAYS && totalHours < MAX_HOURS) {
            totalDays++;
            int empType = (int)(Math.random() * 3);
            int hours = switch (empType) {
                case 1 -> 8;
                case 2 -> 4;
                default -> 0;
            };
            totalHours += hours;
            totalWage += hours * WAGE_PER_HOUR;
        }

        System.out.println("Total Wage using Class Method: " + totalWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        computeWage();
        EmployeeWageCompo employeeWageCompo = new EmployeeWageCompo();
        employeeWageCompo.computeCompanyWage(200,25);
    }

    public  void computeCompanyWage(int wagePerHr,int numberOfDays ) {
        int totalHr = 8;
        this.totalWage = wagePerHr * totalHr *numberOfDays;
        System.out.println("Total Wage  " + totalWage);
    }
}
