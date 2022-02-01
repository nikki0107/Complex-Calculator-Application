package com.example.java;

import java.util.Scanner;

public class Main {

    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }
    static double subtractValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }
    static double multiplyValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }
    static double divideValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a numeric value: ");
            String input1 = sc.nextLine();
            System.out.print("Enter a numeric value: ");
            String input2 = sc.nextLine();
            System.out.print("Choose an operation (+ - * /): ");
            String operator = sc.nextLine();
            double result = 0;
            switch(operator){
                case "+":
                    result = addValues(input1,input2);
                    break;
                case "-":
                    result = subtractValues(input1,input2);
                    break;
                case "*":
                    result = multiplyValues(input1,input2);
                    break;
                case "/":
                    result = divideValues(input1,input2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
            System.out.println("The answer is " + result);

        } catch (Exception e){
            System.out.println("Number formatting exception " + e.getMessage());
        }



    }
}
