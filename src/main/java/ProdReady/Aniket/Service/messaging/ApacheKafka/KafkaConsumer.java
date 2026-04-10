package ProdReady.Aniket.Service.messaging.ApacheKafka;

import ProdReady.Aniket.Service.messaging.MessageConsumer;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Profile("kafka")
public class KafkaConsumer implements MessageConsumer {
  @Override
  @KafkaListener(topics = "myTopic", groupId = "my-group")
  public void receive(String message) {
    try {
      Thread.sleep(100);
    } catch (Exception t) {

    }
    System.out.println("Received :" + message);
  }
}
