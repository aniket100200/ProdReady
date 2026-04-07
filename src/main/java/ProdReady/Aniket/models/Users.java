package ProdReady.Aniket.models;

import ProdReady.Aniket.CustomAnnotations.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @Column(unique = true, nullable = false)
  @ValidUsername
  String username;

  @Email String email;
}
