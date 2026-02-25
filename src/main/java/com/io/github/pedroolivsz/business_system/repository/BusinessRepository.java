package com.io.github.pedroolivsz.business_system.repository;

import com.io.github.pedroolivsz.business_system.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business, Long> {
}
