package org.example.assignment1;

import java.util.Scanner;

public class ass1_2 {

        public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            System.out.println("please enter two numbers:  ");
            int num1 =s.nextInt();
            int num2 =s.nextInt();
            s.close();
            //-----------------------------------------------------------------------
            System.out.println("sum= "+ (num1+num2));
            System.out.println("diffrence is= "+(num1-num2));
            System.out.println("the product is= "+(num1*num2));
            System.out.println("the reminder is= " + (num1%num2));
            //------------------------------------------------------------------------
            if(num1 > num2){
                System.out.println("num1 is greater than num2");
            }else {
                System.out.println("num2 is greater than num1");
            }

            if (num1 == num2){
                System.out.println("the twonumbers are equal");
            }else{
                System.out.println("the two numbers are not equal");
            }
            //---------------------------------------------------------------------
            if ((num2 & num1) > 0 ){
                System.out.println("Both are positive");
            }else if((num2 | num1 )> 0){
                System.out.println("One is positive");
            }else{
                System.out.println("No positives");
            }
            //---------------------------------------------------------------------
            System.out.println(num1>num2 ? "num1 is greater" : "num2 is greater");
            System.out.println(num1%2==0 ? "num1 is even" : "num1 is odd");

        }
    }


