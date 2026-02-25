package com.io.github.pedroolivsz.business_system.repository;

import com.io.github.pedroolivsz.business_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
