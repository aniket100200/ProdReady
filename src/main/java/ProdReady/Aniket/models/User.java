package ProdReady.Aniket.models;

import ProdReady.Aniket.CustomAnnotations.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @Column(unique = true, nullable = false)
  @ValidUsername
  String username;

  @Email String email;

  Integer age;
}
