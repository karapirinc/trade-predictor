package com.tr.cmv.tradepredictor.streamer.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

 public class Rate {

    private BigDecimal value;
    private long timestamp;

     public BigDecimal getValue() {
         return value;
     }

     public void setValue(BigDecimal value) {
         this.value = value;
     }

     public long getTimestamp() {
         return timestamp;
     }

     public void setTimestamp(long timestamp) {
         this.timestamp = timestamp;
     }

     @Override public String toString() {
         return "Rate{" + "value=" + value + ", timestamp=" + timestamp + '}';
     }
 }
