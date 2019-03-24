package com.train

fun main(args: Array<String>) {
val tickets = Tickets(1000, 2000);
    tickets.PrintResult(7 , 3);
}


class Tickets(var OneWayPrice: Int, var RoundTripPrice: Int) {
    init {
            this.RoundTripPrice = (this.RoundTripPrice * 0.9F).toInt();
    }

    fun PrintResult(TotalQty: Int, RoundTripQty: Int) {
        val onewayprice: Int = this.OneWayPrice;
        val roundtriprice: Int = this.RoundTripPrice;
        val totalprice: Int = (onewayprice * (TotalQty - RoundTripQty) + (roundtriprice * RoundTripQty));

        println("Total Tickets: $TotalQty \n" +
                "Round-trip: $RoundTripQty \n" +
                "Total: $totalprice");

    }
}