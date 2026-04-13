package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.CarService;
import ProdReady.Aniket.Service.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@CrossOrigin(origins = "http://localhost:4200") // controller level Enable Cors
public class CarController {
  private final CarService carService;
  private final EmailService emailService;

  @Autowired
  public CarController(CarService carService, EmailService emailService) {
    this.carService = carService;
    this.emailService = emailService;
  }

  @GetMapping("/type/get")
  public String getModel() {

    return carService.getType();
  }

  @GetMapping("/send")
  public String sendEmail() {
    for (int i = 0; i < 100; i++)
      emailService.sendSimpleEmail(
          "khangarsiddheshwar915@gmail.com", "Testing " + (i + 1), " Hello Siddheshwar Khangar ");

    return "Done";
  }
}
