package jp.ken.springbootapi.controller;

import jp.ken.springbootapi.exception.GlobalErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class GlobalErrorController implements ErrorController {

    @Value("${server.error.path:${error.path:/error}}")
    private String errorPath;

    @Autowired
    private ErrorAttributes errorAttributes;

    public String getErrorPath() {
        return errorPath;
    }

    @GetMapping("/error")
    public ResponseEntity<GlobalErrorResponse> error(HttpServletRequest request) {
        Throwable e = (Throwable) request.getAttribute("javax.servlet.error.exception");
        Exception ex = (Exception) request.getAttribute("org.springframework.boot.web.servlet.error.DefaultErrorAttributes.ERROR");
        GlobalErrorResponse errorResponse = new GlobalErrorResponse("E500", ex.getClass().getSimpleName());
        log.info(ex.getClass().getName());
        log.info(ex.getClass().getCanonicalName());
        log.info(ex.getClass().getSimpleName());
        log.info(ex.getClass().getTypeName());
        log.info(ex.getClass().toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}