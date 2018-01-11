package com.tr.cmv.tradepredictor.streamer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BTCStreams {

    String INPUT = "btc-in";
    String OUTPUT = "btc-out";

    @Input(INPUT) SubscribableChannel inboundBtc();

    @Output(OUTPUT) MessageChannel outboundBtc();

}
