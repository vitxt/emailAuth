package com.tedorodev.emailauth.controller;

import com.tedorodev.emailauth.dto.UserDTO;
import com.tedorodev.emailauth.model.User;
import com.tedorodev.emailauth.service.Validation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
    private final Validation validation;
    public SignUpController(Validation validation) {
        this.validation = validation;
    }

    @PostMapping
    public User signUp(@RequestBody UserDTO userDTO) {

    }
}
