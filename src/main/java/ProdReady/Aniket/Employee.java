package ProdReady.Aniket;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @NotNull(message = "Name should not be null")
  String name;

  String department;

  @Min(value = 20000, message = "Salary Must be greater than 20000")
  Long salary;

  @Column(name = "hire_date")
  Date hireDate;
}
