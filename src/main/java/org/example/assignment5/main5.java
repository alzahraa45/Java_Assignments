package org.example.assignment5;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student s1=new Student();
        System.out.println("enter Student name:");
        s1.name=s.nextLine();

        System.out.println("enter Student ID:");
        s1.id=s.nextInt();

        System.out.println("enter Student grade1 ,grade2 and grade3:");
        s1.grade1=s.nextFloat();
        s1.grade2=s.nextFloat();
        s1.grade3=s.nextFloat();

        System.out.println("------------this is Student data------------");
        s1.displayInfo();

    }
}
