package com.brlab.employeewagecompo;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageCompo {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int attendence = 0;
        int dailyWage = 0;
        int wagePerHour = 20;
        int fullDayhr = 8;
        int partTimeHr = 8;
        int employeeType = 0;
        int wagePerMonth =0;
        int numberOfDayPerMonth = 20;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the attendence status :\n0 - Absent\n1 - Present");
            attendence = input.nextInt();


        /*
             Random random = new Random();
             attendence = random.nextInt(2);
            // System.out.println("Random number : "+attendence);
        */
        /*              OR
              attendence = (int)(Math.random() * 2);
              System.out.println("Random number : "+attendence);
        */


        switch (attendence) {
            case 0:
                System.out.println("Employee is Absent,.......");
                break;
            case 1: {
                System.out.println("Employee is Present,......");
                System.out.println("Enter the Employee type : \n0 - Full time\n1 - Part time");
                employeeType = input.nextInt();
                switch (employeeType) {
                    case 0: {
                        System.out.println("Employee is Full time");
                        dailyWage = wagePerHour * fullDayhr;
                        System.out.println("Daily Employee Wage : " + dailyWage);
                        wagePerMonth = numberOfDayPerMonth * dailyWage;
                        System.out.println("Wage for a month : " + wagePerMonth);
                    }
                    break;
                    case 1: {
                        System.out.println("Employee is part time");
                        dailyWage = wagePerHour * partTimeHr;
                        System.out.println("Daily Employee Wage : " + dailyWage);
                        wagePerMonth = numberOfDayPerMonth * dailyWage;
                        System.out.println("Wage for a month : " + wagePerMonth);
                    }
                    break;
                }
            }
            break;


        }
    }
}
