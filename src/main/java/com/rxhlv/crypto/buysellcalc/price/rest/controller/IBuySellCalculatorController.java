package com.rxhlv.crypto.buysellcalc.price.rest.controller;

import com.rxhlv.crypto.buysellcalc.price.rest.request.BuySellCalculatorRequest;
import com.rxhlv.crypto.buysellcalc.price.rest.response.BuySellCalculatorResponse;
import io.swagger.annotations.ApiOperation;

public interface IBuySellCalculatorController {

    @ApiOperation("Calculates the sell price of an asset to obtain the specified profit percentage, factoring in the exchange fee percentage")
    BuySellCalculatorResponse calculate(BuySellCalculatorRequest request);

}
