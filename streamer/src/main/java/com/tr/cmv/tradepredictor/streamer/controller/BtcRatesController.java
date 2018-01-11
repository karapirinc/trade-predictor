package com.tr.cmv.tradepredictor.streamer.controller;

import com.tr.cmv.tradepredictor.streamer.model.Rate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController public class BtcRatesController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sendBtcRate") public Rate sendBtcRate(@RequestParam(value = "value") BigDecimal value) {
        return Rate.builder().value(value).timestamp(new Date().getTime()).build();
    }
}
