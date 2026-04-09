package ProdReady.Aniket.Service.employee.Impl;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.Repository.EmployeeRepository;
import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.Impl.JdbcTemplateService;
import ProdReady.Aniket.Service.employee.EmployeeService;
import ProdReady.Aniket.dtos.respDtos.DefaultResponse;
import ProdReady.Aniket.dtos.respDtos.EmployeeResponse;
import ProdReady.Aniket.exceptions.EmployeeNotFoundException;
import ProdReady.Aniket.models.Users;
import ProdReady.Aniket.transformers.EmployeeTransformer;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository repository;
  private final String CACHE_NAME = "employees";

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

    saveOrUpdate(employee);
    // will revert back if anything goes wrong

    return "Employee Added Successfully";
  }

  @Override
  @Cacheable(value = CACHE_NAME, key = "#id")
  public Employee findById(int id) {
    try {
      Thread.sleep(1000);
    } catch (Exception t) {

    }
    Optional<Employee> optional = repository.findById(id);
    if (optional.isEmpty())
      throw new EmployeeNotFoundException("Unable Find the Employee with Id " + id);

    return optional.get();
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

  @Override
  @CacheEvict(value = CACHE_NAME, key = "#id")
  public DefaultResponse deleteById(int id) {

    Optional<Employee> optional = repository.findById(id);
    if (optional.isEmpty()) throw new EmployeeNotFoundException("Employee With Given Id Not Found");
    repository.deleteById(id);
    return new DefaultResponse(
        "Employee with id = " + id + " Has been deleted Successfully", HttpStatus.OK);
  }

  @Override
  @CacheEvict(value = CACHE_NAME, key = "#id")
  public EmployeeResponse updateName(int id, String name) {
    Optional<Employee> optional = repository.findById(id);
    if (optional.isEmpty()) throw new EmployeeNotFoundException("Unable to find the Employee");

    Employee employee = optional.get();
    employee.setName(name);

    employee = saveOrUpdate(employee);
    return EmployeeTransformer.employeeResponseFromEmployee(employee);
  }

  @CachePut(value = CACHE_NAME, key = "#employee.id")
  public Employee saveOrUpdate(Employee employee) {
    return repository.save(employee);
  }

  //  Clears the ENTIRE "employees" bucket if needed
  @CacheEvict(value = CACHE_NAME, allEntries = true)
  public void deleteAllEmployees() {
    repository.deleteAll();
  }

  public List<Employee> pages() {
    Page<Employee> employeePage = repository.findAll(PageRequest.of(0, 5, Sort.by("name")));
    return employeePage.stream().toList();
  }
}
