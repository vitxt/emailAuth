package com.tedorodev.emailauth.service;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.stream.Collectors;

@Service
public class OTPService {
    public final String GenerateOTP() {
        SecureRandom secureRandom = new SecureRandom();
        String otp = secureRandom.ints(6,0,10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        return otp;
    }
}
