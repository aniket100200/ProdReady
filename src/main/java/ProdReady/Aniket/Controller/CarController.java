package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
  private final CarService carService;

  @Autowired
  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/type/get")
  public String getModel() {

    return carService.getType();
  }
}
