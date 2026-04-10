package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Service.employee.EmployeeService;
import ProdReady.Aniket.dtos.respDtos.DefaultResponse;
import ProdReady.Aniket.dtos.respDtos.EmployeeResponse;
import ProdReady.Aniket.exceptions.UserNotFoundException;
import ProdReady.Aniket.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
  public ResponseEntity<List<User>> getUserList() {
    return ResponseEntity.ok(employeeService.getUsers());
  }

  @GetMapping("/hello")
  public ResponseEntity<String> getResponse() {
    return ResponseEntity.ok("hello");
  }

  @GetMapping("/error")
  public ResponseEntity getError(@RequestParam String type) throws Exception {
    if ("404".equals(type)) throw new UserNotFoundException();
    if ("500".equals(type)) throw new Exception("500 Error");

    return new ResponseEntity(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/total")
  public ResponseEntity<Integer> getTotal() {
    return ResponseEntity.ok(26);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<Employee> findById(@PathVariable("id") int id) {
    Employee employee = employeeService.findById(id);
    return ResponseEntity.ok(employee);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteById(@PathVariable("id") int id) {
    DefaultResponse response = employeeService.deleteById(id);

    return new ResponseEntity(response.message(), response.status());
  }

  @PutMapping("/update")
  public ResponseEntity updateName(@RequestParam("id") int id, @RequestParam("name") String name) {
    EmployeeResponse employeeResponse = employeeService.updateName(id, name);

    return ResponseEntity.ok(employeeResponse);
  }
}
