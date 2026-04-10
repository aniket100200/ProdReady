package ProdReady.Aniket.Service.messaging.RabbitMq;

import ProdReady.Aniket.Service.messaging.MessageProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqMessageProducer implements MessageProducer {
  @Autowired RabbitTemplate rabbitTemplate;

  @Override
  public void send(String message) {
    rabbitTemplate.convertAndSend("myQueue", message);
  }
}
