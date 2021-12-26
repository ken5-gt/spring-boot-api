package jp.ken.springbootapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({Exception.class})  // 処理したい例外
    @ResponseStatus(HttpStatus.FORBIDDEN)  // レスポンスのステータスコード、ここでは403
    public GlobalErrorResponse handleException(Exception e) {
//        log.error("Error:", e.getMessage());
//        return new GlobalErrorResponse("notAuthorized", "The request was not authorized.");
        throw new CustomException("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}