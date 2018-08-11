package com.rxhlv.crypto.buysellcalc.price.rest.response;

import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorResultDto;

public class BuySellCalculatorResponse {

    private double sellPrice;

    public BuySellCalculatorResponse(BuySellCalculatorResultDto dto) {
        this.sellPrice = dto.getSellPrice();
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
