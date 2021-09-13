/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int legalAge = 16;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?: ");
        int age = sc.nextInt();

        String result = (age >= legalAge) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}
