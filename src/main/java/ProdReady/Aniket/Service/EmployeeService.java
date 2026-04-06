package ProdReady.Aniket.Service;

import ProdReady.Aniket.Employee;
import java.util.List;

public interface EmployeeService {

  String addEmployee(Employee employee);

  List<Employee> findByName(String name);

  List<Employee> getAll();
}
