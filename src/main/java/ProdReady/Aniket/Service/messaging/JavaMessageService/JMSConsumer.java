package ProdReady.Aniket.Service.messaging.JavaMessageService;

import ProdReady.Aniket.Service.messaging.MessageConsumer;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Profile("jms")
public class JMSConsumer implements MessageConsumer {
  @Override
  @JmsListener(destination = "queue.sample")
  public void receive(String message) {
    try {
      Thread.sleep(100);
    } catch (Exception t) {

    }
    System.out.println("Message Received: " + message);
  }
}
