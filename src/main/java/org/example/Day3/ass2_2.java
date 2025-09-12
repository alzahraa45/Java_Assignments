package org.example.assignment2;
import java.util.Scanner;

public class ass2_2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age: ");
        int studentAge =s.nextInt();
        System.out.println("student age is: "+studentAge);
        String status=studentAge>18 ? "eligable":"don’t be here";
        System.out.println(status);
//------------------------------------------------------------------------
        if(studentAge >= 18){
            System.out.println("eligable for vote");
        }else{
            System.out.println("not eligable for vote");
        }
//------------------------------------------------------------------------
        System.out.println("Enter a number to figure if even or odd ");
        int number = s.nextInt();
        if (number%2==0){
            System.out.println("the number is "+number + "even");
        }else {
            System.out.println("the number is "+number + "odd");
        }
//------------------------------------------------------------------------
        System.out.println("enter a number to decide positive or negative or zero");
        int num=s.nextInt();
        if (num > 0 ){
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
//------------------------------------------------------------------------
        System.out.println("enter first number");
        int firstnumber=s.nextInt();
        System.out.println("enter second number");
        int secondnumber=s.nextInt();
        System.out.println("enter third number");
        int thirdnumber=s.nextInt();

        if(firstnumber>secondnumber & firstnumber>thirdnumber){
            System.out.println("the 1st number is the biggest");
        } else if (secondnumber>firstnumber & secondnumber>thirdnumber) {
            System.out.println("the 2nd number is the biggest");
        }else {
            System.out.println("the 3rd number is the biggest");
        }
//-------------------------------------------------------------------------

    }
}
