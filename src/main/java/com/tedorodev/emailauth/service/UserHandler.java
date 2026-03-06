package com.tedorodev.emailauth.service;

import com.tedorodev.emailauth.dto.UserDTO;
import com.tedorodev.emailauth.model.User;
import com.tedorodev.emailauth.repository.UserRepo;

public class UserHandler {
    private final UserRepo userRepo;
    public UserHandler(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public  User DTO2User(UserDTO userDTO) {
        return new  User(userDTO.email(), userDTO.password());
    }

    public  UserDTO User2DTO(User user) {
        return new UserDTO(user.getEmail(),  user.getPassword(),  user.isSituation());
    }
    public  User RegisterUser(UserDTO userDTO) {
        User user = DTO2User(userDTO);
        return userRepo.save(user);
    }
    public void RemoveUser(String email) {
        User user = userRepo.findByEmail(email);
        userRepo.delete(user);
    }

}
