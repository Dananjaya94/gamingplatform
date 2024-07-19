package com.gaming.gamingplatform.repository;

import com.gaming.gamingplatform.dto.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    @Query("SELECT s FROM Score s WHERE s.user.id = :userId AND s.score = (SELECT MAX(s2.score) FROM Score s2 WHERE s2.user.id = :userId AND s2.game.id = s.game.id)")
    List<Score> findHighestScoresByUserId(@Param("userId") Long userId);
}