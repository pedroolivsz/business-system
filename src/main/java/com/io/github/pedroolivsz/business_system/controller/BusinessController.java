package com.io.github.pedroolivsz.business_system.controller;

import com.io.github.pedroolivsz.business_system.dto.response.BusinessResponseDTO;
import com.io.github.pedroolivsz.business_system.service.BusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    private final BusinessService service;

    public BusinessController(BusinessService service) {
        this.service = service;
    }

    @GetMapping
    public List<BusinessResponseDTO> findAll() {
        return service.findAll();
    }
}
