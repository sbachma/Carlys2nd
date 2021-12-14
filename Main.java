package com.sbachman;
import java.util.Scanner;
/**
 * A program that takes user input on the number of guests and outputs what
 * the price would be and whether it would be a large event or not.
 * By Sam Bachman
 */
public class Main {
    public static void main(String[] args) {
        int numGuests = getNumGuests();
        borderDisplay.displayBorder();
        outPut(numGuests, findTotalPrice(numGuests), numGuests >= 50);
    }

    public static int getNumGuests() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many guests are there?");
        try
        {
            return s.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Guests must be a whole number, defaulted guest amount to 35.");
            return 35;
        }
    }

    public static int findTotalPrice(int numGuests) {
        final int RATE_PER_PERSON = 35;
        return RATE_PER_PERSON * numGuests;
    }

    public static void outPut(int numGuests, int totalPrice, boolean largeEvent) {
        System.out.printf("The total number of guests is: %d\n", numGuests);
        System.out.println("The price per guest is $35 per person.");
        System.out.printf("The total price is: %d\n", totalPrice);
        if (largeEvent) {
            System.out.println("This is a large event.");
        } else {
            System.out.println("This is not a large event.");
        }
    }
}