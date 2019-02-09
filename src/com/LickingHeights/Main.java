package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberFromOneToNine;
        int numberBetween1768And1769;
        int yearOfBirth;
        int total, total2;

        System.out.println("This is a magic trick that you can use to impress your friends.\nLet me show you how its done.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                                                              ");

        numberFromOneToNine = 4;
        numberBetween1768And1769 = 1769;
        yearOfBirth = 2003;

        System.out.println("First, ask someone to pick a number from 1 to 9.");
        System.out.println("For this example, I'm going to use the number "+numberFromOneToNine+".");
        System.out.println(" ");
        System.out.println("The next thing to do is to multiply that number by 2, \nadd it by 5, and multiply it by 50 in that exact order.");
        System.out.println("Doing that gave me "+((numberFromOneToNine+2)*5+50)+" as my number.");
        total = 650;
        System.out.println(" ");
        System.out.println("After that, ask if their birthday has occurred or not. \nIf not, add 1768, and if so, add 1769");
        System.out.println("My birthday has already occurred, so I would add 1769 to get "+(total+numberBetween1768And1769)+".");
        System.out.println(" ");
        total2 = 2419;
        System.out.println("Last, ask them for the birth year and subtract that from the last answer");
        System.out.println("I was born in 2003, so I would subtract that from 2419 and get "+(total2-yearOfBirth));
        System.out.println(" ");
        System.out.println("At the end of all that you will get a weird number");
        System.out.println("The first part of it is the number they choose at the beginning, \nand the rest is the age of that person.");
        System.out.println("Don't believe me? ");
        System.out.println("416 was the last number I ended up with.");
        System.out.println("The beginning number is 4, which I what I randomly picked, and \nthe last number is 16, which is my age.");
        System.out.println("You can subtract the current year(2019) with the year I was born to confirm my age.");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("I hope you try this out on your friends. Oh and by the way \nthis only works for one year until the trick has to get altered.");
        System.out.println("See ya next time on Koding with a K");
    }
}
