package ProdReady.Aniket.events.producer.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

  private String email;

  public UserCreatedEvent(Object source, String email) {
    super(source);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
