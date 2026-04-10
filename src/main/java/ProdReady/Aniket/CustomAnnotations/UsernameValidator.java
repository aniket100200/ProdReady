package ProdReady.Aniket.CustomAnnotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
    return value != null && value.matches("^(?=.{5,20}$)[a-zA-Z0-9]*_[a-zA-Z0-9]*$");
  }
}
