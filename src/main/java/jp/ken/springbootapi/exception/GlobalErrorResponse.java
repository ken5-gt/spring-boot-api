package jp.ken.springbootapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalErrorResponse {
    String errorCode;
    String message;
}