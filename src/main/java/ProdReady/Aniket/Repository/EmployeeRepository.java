package ProdReady.Aniket.Repository;

import ProdReady.Aniket.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  List<Employee> findByName(String name);

  // let's use the @Query annotation to fetch the data
  @Query("SELECT e FROM Employee e WHERE e.name LIKE %:name% ")
  List<Employee> searchByName(@Param("name") String name);

  @Query("SELECT e FROM Employee e WHERE MOD(e.id, 2) = :mod")
  List<Employee> findByIdModulo(@Param("mod") int mod);
}
