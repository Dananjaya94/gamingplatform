package com.gaming.gamingplatform.repository;

import com.gaming.gamingplatform.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}