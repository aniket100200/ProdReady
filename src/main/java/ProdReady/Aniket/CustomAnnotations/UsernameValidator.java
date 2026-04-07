package ProdReady.Aniket.CustomAnnotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
    return value != null && value.matches("^[a-zA-z0-9_]{5,20}$");
  }
}
