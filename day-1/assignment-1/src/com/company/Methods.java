package com.company;

//for user input
import java.util.Scanner;

/**
 * Created by Sabih Siddiqui on 4/1/2017.
 */
public class Methods {

    //object for Scanner
    Scanner scan = new Scanner(System.in);



    //method for minus
    public int Minus(){
        System.out.println("Enter first value for minus");
        int val1 = scan.nextInt();
        System.out.println("Enter second value for minus");
        int val2 = scan.nextInt();
        return val1-val2;
    }

    //method for plus
    public int Plus(){
        System.out.println("Enter first value for Plus");
        int val1 = scan.nextInt();
        System.out.println("Enter second value for Plus");
        int val2 = scan.nextInt();
        return val1+val2;
    }

    //method for multiply
    public int Multiply(){
        System.out.println("Enter first value for multiply");
        int val1 = scan.nextInt();
        System.out.println("Enter second value for multiply");
        int val2 = scan.nextInt();
        return val1*val2;
    }


    //method for divide
    public int Divide(){
        System.out.println("Enter first value for divide");
        int val1 = scan.nextInt();
        System.out.println("Enter second value for divide");
        int val2 = scan.nextInt();
        return val1/val2;
    }

}
