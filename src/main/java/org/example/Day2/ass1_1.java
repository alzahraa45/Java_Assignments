package org.example.Day2;


public class ass1_1 {
    public static void main(String[] args) {
        //primitive data type
        byte b=127;
        short sh=32767;
        int i=5;
        long l=10;

        float f=10.5f;
        double d=10.5;

        System.out.println(b);
        System.out.println("hello world");
        System.out.println("value of b is:" + b);
        System.out.println("value of b and sh is : "+ b+" , "+sh);

        System.out.println(f+d);
        System.out.println(f+i);
        System.out.println(f+l);

        char c='a';
        char c2='b';
        System.out.println(c+c2);

        boolean t=true; //1
        boolean False=false; //0


        //non primitive data types "array,string,arraylist,hashMap,hashSet"
        int o=3;
        String text="route c2";
        String num1="1";
        String num2="2";
        System.out.println(num1+num2);


        int number=100;
        System.out.println(number);
        number=50;
        System.out.println(number);

    }
}