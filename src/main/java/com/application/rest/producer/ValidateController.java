package com.application.rest.producer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ValidateController {

    @GetMapping("/validate")
    String validate();

}
