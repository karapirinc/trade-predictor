package com.tr.cmv.tradepredictor.streamer.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Rate {

    private BigDecimal value;
    private long timestamp;

}
