package ProdReady.Aniket.Service;

import ProdReady.Aniket.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee>findByName(String name);

    List<Employee> getAll();
}
