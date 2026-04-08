package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Service.employee.EmployeeService;
import ProdReady.Aniket.models.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/add")
  public ResponseEntity addEmployee(@RequestBody Employee employee) {

    String resp = employeeService.addEmployee(employee);

    return ResponseEntity.ok(resp);
  }

  @GetMapping(
      value = "/users",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<List<Users>> getUserList() {
    return ResponseEntity.ok(employeeService.getUsers());
  }

  @GetMapping("/hello")
  public ResponseEntity<String> getResponse() {
    return ResponseEntity.ok("hello");
  }
}
