package com.rxhlv.crypto.buysellcalc.price.rest.request;


import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorDto;

public class BuySellCalculatorRequest {

    private double feePercentage;
    private double profitPercentage;
    private double buyPrice;

    public BuySellCalculatorDto toDto() {
        return new BuySellCalculatorDto(feePercentage, profitPercentage, buyPrice);
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
