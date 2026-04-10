package ProdReady.Aniket.config.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("rabbit")
public class RabbitConfig {

  @Bean
  public Queue myQueue() {
    // The 'true' parameter means the queue will survive a RabbitMQ restart
    return new Queue("myQueue", true);
  }
}
