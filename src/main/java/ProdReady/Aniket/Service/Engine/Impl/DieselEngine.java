package ProdReady.Aniket.Service.Engine.Impl;

import ProdReady.Aniket.Service.Engine.Engine;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine {

  @Override
  public void start() {}

  @Override
  public String getType() {
    return "Diesel";
  }
}
