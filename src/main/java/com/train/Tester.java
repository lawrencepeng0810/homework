package com.train;

public class Tester {
    // 單程票價, 單價
    int OneWayPrice;
    // 來回票價, 單價
    int RoundTripPrice;

    // 總金額
    int TotalPrice;
    // 總票數
    int TotalQty;

    // 各旅程單價
    public Tester(int OneWayPrice, int RoundTripPrice) {
        this.OneWayPrice = OneWayPrice;
        this.RoundTripPrice = (int)((RoundTripPrice) * (0.9F));
    }

    // 計算各價格
    public void PrintResult(int TotalQty, int RoundTripQty) {
        this.TotalQty = TotalQty;
        this.TotalPrice = (this.OneWayPrice * (TotalQty - RoundTripQty)) + (this.RoundTripPrice * RoundTripQty);

        System.out.println(
                "Total tickets: "+ this.TotalQty + "\nRound-trip: " + RoundTripQty +
                "\nTotal:" + this.TotalPrice);
    }
}
