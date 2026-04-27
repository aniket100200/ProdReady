package ProdReady.Aniket.events.listner.user;

import ProdReady.Aniket.events.producer.user.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

  @EventListener
  public void handleUserCreated(UserCreatedEvent event) {
    log.info("User has been created with email {}", event.getEmail());
  }
}
