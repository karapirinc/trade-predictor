package com.tr.cmv.tradepredictor.streamer.service;

import com.tr.cmv.tradepredictor.streamer.BTCStreams;
import com.tr.cmv.tradepredictor.streamer.model.Rate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service @Slf4j public class BtcRatesService {
    private final BTCStreams btcStreams;

    public BtcRatesService(BTCStreams btcStreams) {
        this.btcStreams = btcStreams;
    }

    public void sendBtcRate(final Rate rate) {
        log.info("Sending rate {}", rate);
        MessageChannel messageChannel = btcStreams.outboundBtc();
        messageChannel.send(MessageBuilder.withPayload(rate)
                                    .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
    }
}
