package ProdReady.Aniket.dtos.respDtos;

import org.springframework.http.HttpStatus;

public record DefaultResponse(String message, HttpStatus status) {}
