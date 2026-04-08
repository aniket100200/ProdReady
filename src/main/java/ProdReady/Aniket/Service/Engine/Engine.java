package ProdReady.Aniket.Service.Engine;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
  void start();

  String getType();
}
