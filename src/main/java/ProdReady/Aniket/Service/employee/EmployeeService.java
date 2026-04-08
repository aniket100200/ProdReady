package ProdReady.Aniket.Service.employee;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.models.Users;
import java.util.List;

public interface EmployeeService {

  String addEmployee(Employee employee);

  List<Users> getUsers();

  List<Employee> findByName(String name);

  List<Employee> getAll();
}
