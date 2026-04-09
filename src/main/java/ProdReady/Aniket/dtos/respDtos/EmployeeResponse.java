package ProdReady.Aniket.dtos.respDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeResponse{
  int id;
  String name;
  String department;
  long salary;
}
