package ProdReady.Aniket.Service.Engine.Impl;

import ProdReady.Aniket.Service.Engine.Engine;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {

  @Override
  public void start() {}

  @Override
  public String getType() {
    return "Petrol";
  }
}
