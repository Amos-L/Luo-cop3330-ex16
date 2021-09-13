/*
 *  UCF COP3330 Fall 2021 Assignment 1.16 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is your age? "); //Asking for user input
        int age = x.nextInt(); //Storing user input

        String out = (age < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive."; //Ternary operator, first string is TRUE to the variable, second string is FALSE
        System.out.println(out);
    }
}