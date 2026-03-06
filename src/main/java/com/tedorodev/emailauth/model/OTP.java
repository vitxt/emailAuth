package com.tedorodev.emailauth.model;


import com.tedorodev.emailauth.service.OTPService;

import java.io.Serializable;

public class OTP implements Serializable {
    private OTPService otpService;
    public OTP(OTPService otpService) {
        this.otpService = otpService;
    }
    private String email;
    private String otp;

    public OTP(String email) {
        this.email = email;
        this.otp = otpService.GenerateOTP();
    }
}
