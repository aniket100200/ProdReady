package ProdReady.Aniket.exceptions;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException exception) {
    return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity handMethodArgumentNotValidException(
      MethodArgumentNotValidException exception) {
    return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity handConstraintViolationException(ConstraintViolationException exception) {
    return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(EmployeeNotFoundException.class)
  public ResponseEntity handleEmplyeeNotFoundException(EmployeeNotFoundException exception) {
    return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(FileNotFoundException.class)
  public ResponseEntity<String> handleFileNotFoundException(FileNotFoundException exception) {
    return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
  }
}
