package com.brlab.employeewagecompo;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageCompo {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int attendence = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the attendence status :\n0 - Absent\n1 - Present");
        attendence = input.nextInt();

        /*
                        OR
             Random random = new Random();
             attendence = random.nextInt(2);
             System.out.println("Random number : "+attendence);

                        OR
              attendence = (int)(Math.random() * 2);
              System.out.println("Random number : "+attendence);
        */

        if(attendence == 0)
            System.out.println("Employee is Absent,.......");
        else if (attendence == 1)
            System.out.println("Employee is Present,......");
        else System.out.println("Sorry invalid number,....");
    }
}
