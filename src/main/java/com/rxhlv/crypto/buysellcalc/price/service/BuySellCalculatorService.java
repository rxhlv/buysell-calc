package com.rxhlv.crypto.buysellcalc.price.service;

import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorDto;
import com.rxhlv.crypto.buysellcalc.price.dto.BuySellCalculatorResultDto;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class BuySellCalculatorService implements IBuySellCalculatorService {

    private final Logger logger;

    public BuySellCalculatorService(Logger logger) {
        this.logger = logger;
    }

    private static final BigDecimal ONE_HUNDRED = new BigDecimal(100).setScale(2, RoundingMode.HALF_EVEN);
    private static final int ONE_HUNDRED_INT = 100;
    private static final int ONE = 1;

    @Override
    public BuySellCalculatorResultDto calculatePrimitives(BuySellCalculatorDto dto) {

        double fee = dto.getFeePercentage() / ONE_HUNDRED_INT;

        logger.info("fee: {}", fee);

        double buyPriceTimesFee = dto.getBuyPrice() - dto.getBuyPrice() * fee;

        logger.debug("buyPriceTimesFee: {}", buyPriceTimesFee);

        double sellMultiplier = buyPriceTimesFee - buyPriceTimesFee * fee;

        logger.debug("sellMultiplier: {}", sellMultiplier);

        double profit = (ONE + dto.getProfitPercentage() / ONE_HUNDRED_INT) * dto.getBuyPrice();

        logger.debug("profit: {}", profit);

        double sellPrice = profit / sellMultiplier * dto.getBuyPrice();

        logger.debug("sellPrice: {}", sellPrice);

        return new BuySellCalculatorResultDto(sellPrice);
    }
}
