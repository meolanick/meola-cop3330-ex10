/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int item1;
        int item1_Q;

        int item2;
        int item2_Q;

        int item3;
        int item3_Q;

        double subTotal;
        double tax;
        double total;

        System.out.println("Enter the price of item 1:");
        item1 = scan.nextInt();
        System.out.println("Enter the quantitiy of item 1:");
        item1_Q = scan.nextInt();

        System.out.println("Enter the price of item 2:");
        item2 = scan.nextInt();
        System.out.println("Enter the quantity of item 2:");
        item2_Q = scan.nextInt();

        System.out.println("Enter the price of item 3:");
        item3 = scan.nextInt();
        System.out.println("Enter the quantity of item 3:");
        item3_Q = scan.nextInt();

        subTotal = (item1 * item1_Q) + (item2 * item2_Q) + (item3 *  item3_Q);
        tax = subTotal * 0.055;
        total = subTotal + tax;

        System.out.println("Subtotal: $" + subTotal );
        System.out.println("Tax: $" + tax );
        System.out.println("Total: $" + total );

    }
}
