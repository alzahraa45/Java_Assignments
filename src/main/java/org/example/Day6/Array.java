package org.example.Day6;


public class Array {
// create a method to search an element in array
    public static int searchElement(int[] arr, int target){
      for (int i=0; i<arr.length;i++){
           if (arr[i]==target){
               System.out.println("your element is found at index: "+i);
               return i;
           }
      }
        System.out.println("not found");
        return -1;
    }

// create a method to find number of repetition of a certain number
    public static int NumOfRepetition(int[] arr, int number){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==number){
              count++;
            }
        }
        return count;
    }

//create a method to print an array in reverse order
   public static void ReverseArray(int[] arr){
        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
}

//create a method to check if the array has prime number or not
    public static boolean isPrime(int num){
        if (num<=1){   //prime number start from 2 or more, 0&1 not prime
            return false;}
        for (int i =2;i<= Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        } return true;
    }
public static boolean hasPrime(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (isPrime(arr[i])){
                return true;
            }
        }
        return false;
}

//create a method to print the count of even and odd numbers in the array
    public static void count(int[] arr){
        int even=0;
        int odd =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even = "+even);
        System.out.println("odd = "+odd);
    }

}
