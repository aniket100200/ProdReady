package ProdReady.Aniket.Service.messaging.JavaMessageService;

import ProdReady.Aniket.Service.messaging.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Profile("jms")
public class JMSProducer implements MessageProducer {
  @Autowired JmsTemplate jmsTemplate;

  @Override
  public void send(String message) {
    jmsTemplate.convertAndSend("queue.sample", message);
  }
}
