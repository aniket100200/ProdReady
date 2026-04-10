package ProdReady.Aniket.Service.employee;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.dtos.respDtos.DefaultResponse;
import ProdReady.Aniket.dtos.respDtos.EmployeeResponse;
import ProdReady.Aniket.models.User;
import java.util.List;

public interface EmployeeService {

  String addEmployee(Employee employee);

  Employee findById(int id);

  List<User> getUsers();

  List<Employee> findByName(String name);

  List<Employee> getAll();

  DefaultResponse deleteById(int id);

  EmployeeResponse updateName(int id, String name);
}
