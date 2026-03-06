package com.tedorodev.emailauth.repository;

import com.tedorodev.emailauth.model.OTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OTPRepo extends JpaRepository<OTP, String> {
    OTP findByEmail(String email);


}
