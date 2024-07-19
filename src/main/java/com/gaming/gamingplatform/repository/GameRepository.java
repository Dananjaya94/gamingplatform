package com.gaming.gamingplatform.repository;

import com.gaming.gamingplatform.dto.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}