package com.train

import java.util.*

fun main(args: Array<String>) {
val tickets = tickets(1000, 2000);

    val scanner = Scanner(System.`in`);
    var total = 0;
    while (total != -1) {
        println("Please enter number of tickets: ");
        total = scanner.nextInt();

        if (total == -1) { break; }

        println("How many round-trip tickets: ");
        val roundTrip = scanner.nextInt();

        tickets.printResult(total, roundTrip);
    }
}


class tickets(var oneWayPrice: Int, var roundTripPrice: Int) {
    init {
        // roundTripPrice 9折
        this.roundTripPrice = (this.roundTripPrice * 0.9F).toInt();
    }

    fun printResult(totalQty: Int, roundTripQty: Int) {
        if (totalQty <= roundTripQty ) {
            println("TotalQty Can't less Than RoundTripQty")
            return;        }

        if (totalQty <= 0) {
            println("TotalQty Can't Input : 0")
            return;
        }
        if (roundTripQty <= 0) {
            println("RoundTripQty Can't Input : 0")
            return;
        }
        if (totalQty > 0 && roundTripQty > 0) {
            val oneWayPrice: Int = this.oneWayPrice;
            val roundTripPrice: Int = this.roundTripPrice;
            val totalPrice: Int = (oneWayPrice * (totalQty - roundTripQty) + (roundTripPrice * roundTripQty));

            println(
                "Total Tickets: $totalQty \nRound-trip: $roundTripQty \nTotal: $totalPrice"
            );

            println();
        }
    }
}