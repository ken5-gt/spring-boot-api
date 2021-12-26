package jp.ken.springbootapi.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class CustomException extends RuntimeException {
    String message;
    HttpStatus httpStatus;
}