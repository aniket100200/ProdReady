package ProdReady.Aniket.Service;

import ProdReady.Aniket.Service.Engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarService {
  @Autowired
  @Qualifier("petrolEngine")
  Engine engine;

  public String getType() {
    return engine.getType();
  }
}
