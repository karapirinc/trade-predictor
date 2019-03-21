package com.tr.cmv.tradepredictor.streamer.service;

import com.tr.cmv.tradepredictor.streamer.model.Rate;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service public class BtcRatesService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BtcRatesService.class);

    @Autowired private KafkaTemplate<String, String> kafkaTemplate;

    private final static String BTC_RATE_TOPIC = "btc_rate_topic";

    public void sendBtcRate(final Rate rate) {
        log.info("Sending rate {}", rate);

        String payload = rate.toString();
        kafkaTemplate.send(BTC_RATE_TOPIC, payload);

        log.info("Message: {}  sent to topic: ", payload, BTC_RATE_TOPIC);
    }

    @KafkaListener(topics = "topic1") public void receiveBTCRateTopic(ConsumerRecord<?, ?> consumerRecord) {
        log.info("Receiver on {}: {}", BTC_RATE_TOPIC, consumerRecord.toString());
    }
}
