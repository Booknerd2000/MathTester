package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberFromOneToNine;
        //int numberBetween1768And1769;
        //int yearOfBirth;

        System.out.println("I have a magic trick that you can use to impress your friends.\nLet me show you how it is done.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                                                              ");
        numberFromOneToNine = 4;

       // numberBetween1768And1769 = 1769;

        //yearOfBirth = 2003;

        System.out.println("First, ask someone to pick a number from 1 to 9.");
        System.out.println("For this example, i'm going to use the number "+numberFromOneToNine+".");
        System.out.println("The next thing to do is to add that number by 2, \nmultiply it by 5, and add it by 50 in that exact order.");
        System.out.println("Doing that gave me "+((numberFromOneToNine+2)*5+50));
    }
}
