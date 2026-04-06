package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired EmployeeService employeeService;

  @GetMapping(
      value = "/get/{name}",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<List<Employee>> getByName(@PathVariable("name") String name) {
    List<Employee> employees = employeeService.findByName(name);

    return ResponseEntity.ok(employees);
  }

  @GetMapping(value = "/find")
  public ResponseEntity getAll() {
    List<Employee> employees = employeeService.getAll();
    return ResponseEntity.ok(employees);
  }
}
