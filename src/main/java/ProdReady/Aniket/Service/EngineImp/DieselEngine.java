package ProdReady.Aniket.Service.EngineImp;

import ProdReady.Aniket.Service.Engine;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine {

    @Override
    public void start() {

    }

    @Override
    public String getType() {
        return "Diesel";
    }
}
