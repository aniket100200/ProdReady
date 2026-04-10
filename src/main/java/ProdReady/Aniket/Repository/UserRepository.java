package ProdReady.Aniket.Repository;

import ProdReady.Aniket.models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findByUsername(String username);

  Optional<User> findByEmail(String email);

  @Query("SELECT u FROM User u WHERE MOD(u.id, 2) = :mod")
  List<User> findByIdModulo(@Param("mod") int mod);
}
