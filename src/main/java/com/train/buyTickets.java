package com.train;

import java.util.Scanner;

public class buyTickets {
    public static void main(String[] args) {
            int totalQty = 0;
            Scanner scanner = new Scanner(System.in);
            //
            while (totalQty != -1) {
                Tester ticket = new Tester(1000, 2000);

                System.out.println("Please enter number of tickets: ");
                totalQty = scanner.nextInt();

                if (totalQty == -1) { break; }

                System.out.println("How many round-trip tickets: ");
                int roundTripQty = scanner.nextInt();

                if (totalQty <= roundTripQty) {
                    System.out.println("TotalQty Can't less Than RoundTripQty");
                    return;
                }

                if (totalQty == 0) {
                    System.out.println("TotalQty Input Can't : 0");
                    return;
                }

                if (roundTripQty <= 0) {
                    System.out.println("RoundTripQty Can't Input : 0");
                    return;
                }

                ticket.PrintResult(totalQty, roundTripQty);
            }
    }
}
