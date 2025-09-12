package org.example.assignment2;

import java.util.Scanner;

public class ifCondition {
//IF statement assignment

    public class Main {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("please enter two numbers to start comparison : ");
            int num1 =s.nextInt();
            int num2 =s.nextInt();

            if(num1>num2){
                System.out.println("number 1 is the largest");
            }else {
                System.out.println("number 2 is the largest");
            }
            //ternary
            System.out.println(num1>num2 ? "num 1 is the largest" : "num 2 is the largest");

            System.out.println("-------------------this is the second question-------------------");

// question 2
            System.out.println("please enter three numbers to find the smallest: ");
            int x =s.nextInt();
            int y =s.nextInt();
            int z =s.nextInt();

            if(x<y & x<z){
                System.out.println("the first number is the smallest");
            } else if (y<x &y<z) {
                System.out.println("the second number is the smallest");
            }else{
                System.out.println("the third number is the smallest");
            }
// question 3
            System.out.println("-------------------this is the third question-------------------");
            System.out.print("enter the day: (sat, sun, mon, tue, wed, thu, fri): ");
            s.nextLine();
            String dayName = s.nextLine().toLowerCase();
            switch (dayName)
            {
                case "sat":
                    System.out.println("1");
                    break;
                case "sun":
                    System.out.println("2");
                    break;
                case "mon":
                    System.out.println("3");
                    break;
                case "tue":
                    System.out.println("4");
                    break;
                case "wed":
                    System.out.println("5");
                    break;
                case "thu":
                    System.out.println("6");
                    break;
                case "fri":
                    System.out.println("7");
                    break;
                default:
                    System.out.println("please enter valid value");
            }

        }
    }

}
