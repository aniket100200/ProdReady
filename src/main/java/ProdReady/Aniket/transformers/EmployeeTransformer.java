package ProdReady.Aniket.transformers;

import ProdReady.Aniket.Employee;
import ProdReady.Aniket.dtos.respDtos.EmployeeResponse;

public class EmployeeTransformer {
  public static EmployeeResponse employeeResponseFromEmployee(Employee employee) {
    return EmployeeResponse.builder()
        .id(employee.getId())
        .name(employee.getName())
        .salary(employee.getSalary())
        .department(employee.getDepartment())
        .build();
  }
}
