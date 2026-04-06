package ProdReady.Aniket;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import java.sql.Date;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
@Builder
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  String name;
  String department;

  @Nullable Long salary;

  @Column(name = "hire_date")
  Date hireDate;
}
