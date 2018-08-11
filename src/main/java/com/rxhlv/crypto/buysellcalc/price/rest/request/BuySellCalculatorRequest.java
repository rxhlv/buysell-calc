package com.rxhlv.crypto.buysellcalc.price.rest.request;


import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorDto;
import io.swagger.annotations.ApiModelProperty;

public class BuySellCalculatorRequest {

    @ApiModelProperty(required = true,
            example = "0.5",
            value = "The fee percentage an exchange charges per buy/sell operation")
    private double feePercentage;

    @ApiModelProperty(required = true,
            example = "1",
            value = "The percentage of profit you want to make after selling")
    private double profitPercentage;

    @ApiModelProperty(required = true,
            example = "121600",
            value = "The price at which you bought or intend to buy")
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
