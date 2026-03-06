package com.tedorodev.emailauth.controller;

import com.tedorodev.emailauth.dto.OTPDTO;
import com.tedorodev.emailauth.service.EmailService;
import com.tedorodev.emailauth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private final EmailService emailService;
    private final UserService userService;
    public EmailController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @PostMapping("/code")
    public void signUp(@RequestBody OTPDTO otpDTO) {

    }
}

