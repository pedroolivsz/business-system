package com.io.github.pedroolivsz.business_system.service;

import com.io.github.pedroolivsz.business_system.dto.response.UserResponseDTO;
import com.io.github.pedroolivsz.business_system.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserResponseDTO> listAll() {
        return repository.findAll().stream().map(UserResponseDTO::new).toList();
    }
}
