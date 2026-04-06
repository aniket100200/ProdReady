package ProdReady.Aniket.Service.Impl;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Repository.EmployeeRepository;
import ProdReady.Aniket.Service.EmployeeService;
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

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository repository) {
    this.repository = repository;
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
