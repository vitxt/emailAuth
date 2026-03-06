package com.tedorodev.emailauth.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ContasUnify")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String email;
    private String password;
    private boolean situation;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.situation = false;
    }

    protected User() {
    }
}