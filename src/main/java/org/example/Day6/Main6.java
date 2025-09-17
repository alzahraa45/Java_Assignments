package org.example.Day6;
import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    //first method , search in array
        int arr[]={25,36,2,44,7,45,2,44};

       /* System.out.print("please enter the number you want to search: ");
       int target=s.nextInt();
        int result = Array.searchElement(arr, target);
        System.out.println(result); */

    //second method,find nuber of repetition
      /*  System.out.print("please enter the number you want to find his repetition: ");
        int target= s.nextInt();
        int repetitions=Array.NumOfRepetition(arr,target);
        if (repetitions > 0) {
            System.out.println("The number " + target + " is repeated " + repetitions + " times.");
        } else {
            System.out.println("Number " + target + " not found.");
        }*/

    //build in function to sort an array
       /* Arrays.sort(arr);
        System.out.println("sorted array is :"+Arrays.toString(arr));*/

//forth question : print the array in reversed order
       /* System.out.println("the array in reversed order is ");
        Array.ReverseArray(arr);*/

// calling the function isprime to check if the array has prime numbers or not
       /*if (Array.hasPrime(arr)){
           System.out.println("The array contains a prime number.");
       }else {
           System.out.println("The array does not contain a prime number.");
       }*/

// calling the function count the even and odd numbers on array
        Array.count(arr);



    }
}
