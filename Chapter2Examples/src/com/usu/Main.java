package com.usu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ACCEPTING INPUT / BASIC EXPRESSIONS
//        final double PI = 3.14159;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        double radius = scanner.nextDouble();
//        System.out.println("Your area is " + (PI * radius * radius));

        // Range of byte = -2^7 to 2^7 -1
        byte age = 127;
        int biggerAge = 127;
        byte smallerAge = (byte)biggerAge;

        // Range of short = -2^15 to 2^15 -1
        short age2 = 32000;
        // Range of int = -2^31 to 2^31 - 1
        int age3 = 234958729;
        // Range of long -2^63 to 2^63 - 1
        double number = 10;
        int number2 = (int) number;
        long currentTime = System.currentTimeMillis();
        float decimalValue = 10.3f;
        float result = (float)(1.0/3.0);
        System.out.println(result);
        double result2 = 1.0/3.0;
        System.out.println(result2);
        int value = (int)1.9999;
        System.out.println(value);
        System.out.println(Math.round(2.55));
//       parens then * / % then + -

        int value2 = 1 + 10 * 2 + 10 * 25 / 3;
    }
}
