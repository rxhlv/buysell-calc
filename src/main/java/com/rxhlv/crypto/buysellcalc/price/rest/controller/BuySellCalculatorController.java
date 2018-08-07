package com.rxhlv.crypto.buysellcalc.price.rest.controller;

import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorResultDto;
import com.rxhlv.crypto.buysellcalc.price.rest.request.BuySellCalculatorRequest;
import com.rxhlv.crypto.buysellcalc.price.rest.response.BuySellCalculatorResponse;
import com.rxhlv.crypto.buysellcalc.price.service.IBuySellCalculatorService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dtc")
public class BuySellCalculatorController implements IBuySellCalculatorController {

    private final IBuySellCalculatorService fiatPriceCalculatorService;
    private final Logger logger;

    public BuySellCalculatorController(IBuySellCalculatorService fiatPriceCalculatorService, Logger logger) {
        this.fiatPriceCalculatorService = fiatPriceCalculatorService;
        this.logger = logger;
    }

    @Override
    @PostMapping("calculate")
    public BuySellCalculatorResponse calculate(@RequestBody BuySellCalculatorRequest request) {
        BuySellCalculatorResultDto result = fiatPriceCalculatorService.calculatePrimitives(request.toDto());

        return new BuySellCalculatorResponse(result);
    }
}
