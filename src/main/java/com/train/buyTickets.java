package com.train;

import java.util.Scanner;

public class buyTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tester ticket = new Tester(1000, 2000);

        System.out.println("Please enter number of tickets: ");
        int TotalQty = scanner.nextInt();

        System.out.println("How many round-trip tickets: ");
        int RoundTripQty = scanner.nextInt();

        if (TotalQty <= RoundTripQty ) {
            System.out.println("TotalQty Can't less Than RoundTripQty");
            return;
        }

        if (TotalQty <= 0) {
            System.out.println("TotalQty Input Can't : 0");
            return;
        }

        if (RoundTripQty <= 0) {
            System.out.println("RoundTripQty Can't Input : 0");
            return;
        }

        ticket.PrintResult(TotalQty,RoundTripQty);
    }
}
