package com.tr.cmv.tradepredictor.streamer.controller;

import com.tr.cmv.tradepredictor.streamer.model.Rate;
import com.tr.cmv.tradepredictor.streamer.service.BtcRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController public class BtcRatesController {

    //    private static final String template = "Hello, %s!";
    //    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private BtcRatesService btcRatesService;

    @RequestMapping("/sendBtcRate") public Rate sendBtcRate(@RequestParam(value = "value") BigDecimal value) {
        Rate rate=new Rate();
        rate.setValue(value);
        rate.setTimestamp(new Date().getTime());
        btcRatesService.sendBtcRate(rate);
        return rate;
    }
}
