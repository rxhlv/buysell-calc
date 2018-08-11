package com.rxhlv.crypto.buysellcalc.price.rest.response;

import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorResultDto;
import io.swagger.annotations.ApiModelProperty;

public class BuySellCalculatorResponse {

    @ApiModelProperty(required = true,
            value = "The price at which you need to sell to make the expected profit percentage")
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
