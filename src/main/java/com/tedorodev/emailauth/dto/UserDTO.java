package com.tedorodev.emailauth.dto;

public record UserDTO(String email, String password, boolean confirmed) {
}
