package com.io.github.pedroolivsz.business_system.dto.response;

import com.io.github.pedroolivsz.business_system.entity.Business;
import com.io.github.pedroolivsz.business_system.entity.enums.StatusBusiness;

public record BusinessResponseDTO(String name, String cnpj, String email, String phoneNumber, StatusBusiness status) {
    public BusinessResponseDTO(Business business) {
        this(business.getName(), business.getCnpj(), business.getEmail(), business.getPhoneNumber(), business.getStatusBusiness());
    }
}
