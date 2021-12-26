package jp.ken.springbootapi.controller;

import jp.ken.springbootapi.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@RestController
@Validated
public class ApiController {

    @RequestMapping(method= RequestMethod.GET)
    public String hello() throws Exception {
        throw new CustomException("This is the internal server error.", HttpStatus.INTERNAL_SERVER_ERROR);
//        return "Hello World";
    }

    @GetMapping(path = "/test")
    public String test(@Valid @Max(3) @Size(max = 3) @RequestParam("str") String str) {
        return "X";
    }
}