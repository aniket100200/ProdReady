package ProdReady.Aniket.Service.Impl;

import ProdReady.Aniket.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcTemplateService {

    /*
        - JPA → Faster development, less SQL
        - JDBC → More control, more flexibility
     */
  @Autowired JdbcTemplate jdbcTemplate;

  /*
  When to use JdbcTemplate?

  - Complex SQL queries
  - Performance-critical operations
  - Stored procedures
  - When you need full SQL control
   */

  public List<Employee> getEmployees() {
    return jdbcTemplate.query(
        "SELECT * FROM employees",
        (rs, rowNum) -> {
          return Employee.builder()
              .id(rs.getInt("id"))
              .name(rs.getString("name"))
              .department(rs.getString("department"))
              .salary(rs.getLong("salary"))
              .build();
        });
  }
}
