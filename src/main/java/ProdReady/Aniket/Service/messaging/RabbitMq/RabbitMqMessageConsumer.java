package ProdReady.Aniket.Service.messaging.RabbitMq;

import ProdReady.Aniket.Service.messaging.MessageConsumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqMessageConsumer implements MessageConsumer {
  @Override
  @RabbitListener(queues = "myQueue")
  public void receive(String message) {
    //    try {
    //      Thread.sleep(100);
    //    } catch (Exception t) {
    //
    //    }
    System.out.println("Recieved: " + message);
  }
}
