package org.example.assignment5;

public class Student {
    String name;
    int id;
    float grade1,grade2,grade3;
    double avg;

    public double calculateAverage(){
         avg=(grade1+grade2+grade3)/3;
         return avg;
    }
    public boolean isPassed(){
        double average=calculateAverage();
       if (average>=50){
           return true;
       }else{
           return false;
       }
    }
    public void displayInfo(){
        System.out.println("--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Average: %.2f\n", calculateAverage());
        System.out.println("Result: " + (isPassed() ? "Passed" : "Failed"));
        System.out.println("-------------------------------");
    }

}
