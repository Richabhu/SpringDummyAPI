package com.application.rest.producer;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateControllerImpl implements ValidateController {

    @Override
    public String validate() {
        return "Validation Successful!!";
    }
}