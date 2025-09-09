package org.example.assignment2;
import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args)
    {
        int rate =15;
        int maxWeeklyHours=40;

        Scanner s=new Scanner(System.in);
        System.out.println("enter your weekly hours");
        double empWeeklyHours=s.nextDouble();

        while (empWeeklyHours > maxWeeklyHours){
            System.out.println("invalid entry, please enter between 1h to 40h");
        }
        double grossSalary=empWeeklyHours*rate;
        System.out.println("your weekly gross salary is :"+grossSalary+"$");

    }
}
