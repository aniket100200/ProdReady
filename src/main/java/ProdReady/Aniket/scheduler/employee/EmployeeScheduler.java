package ProdReady.Aniket.scheduler.employee;

import ProdReady.Aniket.Repository.EmployeeRepository;
import ProdReady.Aniket.Service.mail.EmailService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeScheduler {

  final EmailService emailService;
  final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeScheduler(EmailService emailService, EmployeeRepository employeeRepository) {
    this.emailService = emailService;
    this.employeeRepository = employeeRepository;
  }

  //  @Scheduled(cron = "0 10 11 * * FRI") // every Friday 11:08 AM
  //  public void fetchEmployeesAndSendEmail() {
  //    List<Employee> employees = employeeRepository.findByIdModulo(1);
  //    employees.forEach(x -> {});
  //  }
}
