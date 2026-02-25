package com.io.github.pedroolivsz.business_system.service;

import com.io.github.pedroolivsz.business_system.dto.response.BusinessResponseDTO;
import com.io.github.pedroolivsz.business_system.repository.BusinessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {
    private final BusinessRepository repository;

    public BusinessService(BusinessRepository repository) {
        this.repository = repository;
    }

    public List<BusinessResponseDTO> findAll() {
        return repository.findAll().stream().map(BusinessResponseDTO::new).toList();
    }
}
