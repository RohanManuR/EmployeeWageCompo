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

        if(attendence == 0)
            System.out.println("Employee is Absent,.......");
        else if (attendence == 1) {
            System.out.println("Employee is Present,......");
            System.out.println("Enter the Employee type : \n0 - Full time\n1 - Part time" );
            employeeType = input.nextInt();
            if(employeeType == 0) {
                System.out.println("Employee is Full time");
                dailyWage = wagePerHour * fullDayhr;
                System.out.println("Daily Employee Wage : " + dailyWage);
            }
            else
            {
                System.out.println("Employee is part time");
                dailyWage = wagePerHour * partTimeHr;
            System.out.println("Daily Employee Wage : " + dailyWage);
            }
        }
        else System.out.println("Sorry invalid number,....");
    }
}
