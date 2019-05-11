package com.train;

public class TicketsTester {
    // 單程票價, 單價
    int oneWayPrice;
    // 來回票價, 單價
    int roundTripPrice;

    // 總金額
    int totalPrice;
    // 總票數
    int totalQty;

    // 各旅程單價
    public TicketsTester(int OneWayPrice, int RoundTripPrice) {
        this.oneWayPrice = OneWayPrice;
        this.roundTripPrice = (int)((RoundTripPrice) * (0.9F));
    }

    // 計算各價格
    public void PrintResult(int TotalQty, int RoundTripQty) {
        this.totalQty = TotalQty;
        this.totalPrice = (this.oneWayPrice * (TotalQty - RoundTripQty)) + (this.roundTripPrice * RoundTripQty);

        System.out.println(
                "Total tickets: "+ this.totalQty + "\nRound-trip: " + RoundTripQty +
                "\nTotal:" + this.totalPrice);
        System.out.println();
    }
}
