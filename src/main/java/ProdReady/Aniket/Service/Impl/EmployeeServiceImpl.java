package ProdReady.Aniket.Service.Impl;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Repository.EmployeeRepository;
import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.EmployeeService;
import ProdReady.Aniket.models.Users;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository repository;

  @Autowired JdbcTemplateService jdbcTemplateService;

  @Autowired UserRepository userRepository;

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository repository) {
    this.repository = repository;
  }

  @Override
  @Transactional
  public String addEmployee(Employee employee) {
    Employee saveEmployee =
        Employee.builder()
            .name(employee.getName())
            .department(employee.getDepartment())
            .hireDate(employee.getHireDate())
            .salary(employee.getSalary())
            .build();

    repository.save(saveEmployee);
    // will revert back if anything goes wrong

    return "Employee Added Successfully";
  }

  @Override
  public List<Users> getUsers() {

    return userRepository.findAll();
  }

  @Override
  public List<Employee> findByName(String name) {
    List<Employee> employees = jdbcTemplateService.getEmployees();

    return employees;
  }

  @Override
  public List<Employee> getAll() {
    List<Employee> employees = repository.findAll();
    return employees;
  }

  public List<Employee> pages() {
    Page<Employee> employeePage = repository.findAll(PageRequest.of(0, 5, Sort.by("name")));
    return employeePage.stream().toList();
  }
}
