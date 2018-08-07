package com.rxhlv.crypto.buysellcalc.price.dto;

public class BuySellCalculatorResultDto {

    private double sellPrice;

    public BuySellCalculatorResultDto(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
