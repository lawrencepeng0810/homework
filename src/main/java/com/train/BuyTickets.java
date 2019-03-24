package com.train;

import java.util.Scanner;

public class BuyTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tester ticket = new Tester(1000, 2000);

        System.out.println("Please enter number of tickets: ");
        int Total = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int RoundTrip = scanner.nextInt();
        ticket.PrintResult(Total,RoundTrip);
    }
}
