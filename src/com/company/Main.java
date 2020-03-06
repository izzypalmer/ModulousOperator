package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
    }

    public static void testOddness() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int number;

        System.out.println("insert #");
        number = keyboard.nextInt();

        System.out.println("number is odd: " + (number % 2 != 0));


    }



    public static void keepContained() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int number;

        System.out.println("insert positive #");
        number = keyboard.nextInt();

        System.out.println("number contained is: " + ((number % 8) + 5));

    }



}
