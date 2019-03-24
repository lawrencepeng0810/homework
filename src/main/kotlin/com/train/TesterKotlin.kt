package com.train

import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
val tickets = Tickets(1000, 2000);

    val scanner = Scanner(System.`in`);

    println("Please enter number of tickets: ");
    val Total = scanner.nextInt();

    println("How many round-trip tickets: ");
    val RoundTrip = scanner.nextInt();

    tickets.PrintResult(Total , RoundTrip);
}


class Tickets(var OneWayPrice: Int, var RoundTripPrice: Int) {
    init {
        // RoundTripPrice 9折
            this.RoundTripPrice = (this.RoundTripPrice * 0.9F).toInt();
    }

    fun PrintResult(TotalQty: Int, RoundTripQty: Int) {
        if (TotalQty <= RoundTripQty ) {
            println("TotalQty Can't less Than RoundTripQty")
            return;
        }

        if (TotalQty <= 0) {
            println("TotalQty Can't Input : 0")
            return;
        }

        if (RoundTripQty <= 0) {
            println("RoundTripQty Can't Input : 0")
            return;
        }

        if (TotalQty > 0 && RoundTripQty > 0) {
            val onewayprice: Int = this.OneWayPrice;
            val roundtriprice: Int = this.RoundTripPrice;
            val totalprice: Int = (onewayprice * (TotalQty - RoundTripQty) + (roundtriprice * RoundTripQty));

            println(
                "Total Tickets: $TotalQty \n" +
                "Round-trip: $RoundTripQty \n" +
                "Total: $totalprice"
            );
        }
    }
}