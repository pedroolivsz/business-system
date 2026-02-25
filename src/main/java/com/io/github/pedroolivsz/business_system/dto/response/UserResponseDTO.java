package com.io.github.pedroolivsz.business_system.dto.response;

import com.io.github.pedroolivsz.business_system.entity.User;

public record UserResponseDTO(String name, String cpf, String email, String phoneNumber, String password) {
    public UserResponseDTO(User user) {
        this(user.getName(), user.getCpf(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
    }
}
