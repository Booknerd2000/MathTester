package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberFromOneToNine;
        int numberBetween1768And1769;
        //int yearOfBirth;
        int total;

        System.out.println("I have a magic trick that you can use to impress your friends.\nLet me show you how it is done.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                                                              ");

        numberFromOneToNine = 4;
       // numberBetween1768And1769 = 1769;
        //yearOfBirth = 2003;

        System.out.println("First, ask someone to pick a number from 1 to 9.");
        System.out.println("For this example, i'm going to use the number "+numberFromOneToNine+".");
        System.out.println(" ");
        System.out.println("The next thing to do is to multiply that number by 2, \nadd it by 5, and multiply it by 50 in that exact order.");
        System.out.println("Doing that gave me "+((numberFromOneToNine+2)*5+50)+" as my number.");
        total = 650;
        System.out.println(" ");
        System.out.println("After that, ask if their birthday has occurred or not. \nIf not, add 1768, and if so, add 1769");
        System.out.println("My birthday has occurred, so I would add 1769 to get "+(total+1769));
    }
}
