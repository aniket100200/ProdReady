package ProdReady.Aniket.Service.Engine.Impl;

import ProdReady.Aniket.Service.Engine.Engine;
import ProdReady.Aniket.Service.Engine.qualifyers.EngineQualifiers;
import org.springframework.stereotype.Component;

@Component
@EngineQualifiers.PetrolEngine
public class PetrolEngineServiceImpl implements Engine {

  @Override
  public void start() {}

  @Override
  public String getType() {
    return "Petrol";
  }
}
