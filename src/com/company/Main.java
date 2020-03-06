package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        testOddness();
    }

    public static void testOddness() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int number;

        System.out.println("insert #");
        number=keyboard.nextInt();

        System.out.println("number is odd: " + (number % 2 != 0));






    }
}
