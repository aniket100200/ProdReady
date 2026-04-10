package ProdReady.Aniket.Service.messaging.ApacheKafka;

import ProdReady.Aniket.Service.messaging.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Profile("kafka")
public class KafkaProducer implements MessageProducer {
  @Autowired KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void send(String message) {
    kafkaTemplate.send("myTopic", message);
  }
}
