package com.rxhlv.crypto.buysellcalc.price.service;

import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorDto;
import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorResultDto;

public interface IBuySellCalculatorService {

    BuySellCalculatorResultDto calculatePrimitives(BuySellCalculatorDto dto);
    BuySellCalculatorResultDto shortSell(BuySellCalculatorDto dto);
}
