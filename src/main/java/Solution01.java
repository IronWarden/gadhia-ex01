/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

/*
Create a program that prompts for your name and prints a greeting using your name.
Perform the input, string concatenation, and output in separate statements.
*/
import java.util.*;
public class Solution01 {

    public static void main(String[] args) {
        // prompt name and take input
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?");
        String str = sc.nextLine();

        // string concatenation
        String s1 = "Hello,";
        String s2 = ", nice to meet you!";
        String s3 = s1 + " " + str + " " + s2;

        // output
        System.out.println(s3);


    }



}

