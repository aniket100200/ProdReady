package ProdReady.Aniket.Service;

import ProdReady.Aniket.Service.Engine.Engine;
import ProdReady.Aniket.Service.Engine.qualifyers.EngineQualifiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CarService {

  @Autowired @EngineQualifiers.PetrolEngine private Engine petrolEngine; // Removed 'final'

  @Autowired @EngineQualifiers.DieselEngine private Engine dieselEngine; // Removed 'final'

  @Cacheable(value = "types")
  public String getType() {
    return "{ 'DieselEngine': "
        + dieselEngine.getType()
        + ",\n 'PetrolEngine' : "
        + petrolEngine.getType()
        + " }";
  }
}
