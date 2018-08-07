package com.rxhlv.crypto.buysellcalc.price.rest.controller;

import com.rxhlv.crypto.buysellcalc.price.rest.request.BuySellCalculatorRequest;
import com.rxhlv.crypto.buysellcalc.price.rest.response.BuySellCalculatorResponse;

public interface IBuySellCalculatorController {

    BuySellCalculatorResponse calculate(BuySellCalculatorRequest request);

}
