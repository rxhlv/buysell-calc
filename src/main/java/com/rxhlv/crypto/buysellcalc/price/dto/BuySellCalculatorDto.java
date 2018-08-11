package com.rxhlv.crypto.buysellcalc.price.dto;

public class BuySellCalculatorDto {

    private double feePercentage;
    private double profitPercentage;
    private double buyPrice;

    public BuySellCalculatorDto(double feePercentage, double profitPercentage, double buyPrice) {
        this.feePercentage = feePercentage;
        this.profitPercentage = profitPercentage;
        this.buyPrice = buyPrice;
    }

    public double getFeePercentage() {
        return feePercentage;
    }

    public void setFeePercentage(double feePercentage) {
        this.feePercentage = feePercentage;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(double profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
}
