package org.example.Day5;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numberOfStudents=3;
        Student [] students=new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i].name = s.nextLine();
            System.out.print("Enter ID: ");
            students[i].id = s.nextInt();
            System.out.print("Enter grade for subject 1: ");
            students[i].grade1 = s.nextFloat();
            System.out.print("Enter grade for subject 2: ");
            students[i].grade2 = s.nextFloat();
            System.out.print("Enter grade for subject 3: ");
            students[i].grade3 = s.nextFloat();
            s.nextLine();
        }
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }



       /* Student s1=new Student();     //حل اخر
        System.out.println("enter Student name:");
        s1.name=s.nextLine();

        System.out.println("enter Student ID:");
        s1.id=s.nextInt();

        System.out.println("enter Student grade1 ,grade2 and grade3:");
        s1.grade1=s.nextFloat();
        s1.grade2=s.nextFloat();
        s1.grade3=s.nextFloat();

        System.out.println("------------this is Student data------------");
        s1.displayInfo();*/

    }
}
