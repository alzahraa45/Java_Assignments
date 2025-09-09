package org.example.assignment2;
import java.util.Scanner;

public class AddNumbeDoWhile {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        boolean again = false;

        do{
            System.out.println("enter first number");
            double num1= s.nextDouble();
            System.out.println("enter second number");
            double num2= s.nextDouble();

            double sum=num1+num2;
            System.out.println("the sum is: "+sum);

            System.out.println("would you like to sum another numbers? /n write true if you want to insert another number");
            again=s.nextBoolean();
            if (again == false){
                System.out.println("good bye! ");
            }
        }while (again);


    }
}