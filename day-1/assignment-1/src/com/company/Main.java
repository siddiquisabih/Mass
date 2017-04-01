package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here



        //object for method class
        Methods methods = new Methods();


        //store all the methods value in variable
        int minus = methods.Minus();
        int multiply = methods.Multiply();
        int plus = methods.Plus();
        int divide = methods.Divide();



        //print all the answer in the end of calculations
        System.out.println("Answer for minus is "+minus + "\n");
        System.out.println("Answer for plus is "+plus + "\n");
        System.out.println("Answer for multiply is "+multiply + "\n");
        System.out.println("Answer for divide is "+divide + "\n");
    }
}
