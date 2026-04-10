package ProdReady.Aniket.dtos.reqDtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequestDto(
    @NotBlank(message = "Username cannot be blank") String username,
    @Email(message = "Email Should be in valid Format") String email,
    @NotNull(message = "Age is required") @Min(value = 18, message = "Age must be at least 18")
        Integer age) {}
