package com.gaming.gamingplatform.service;

import com.gaming.gamingplatform.dto.Score;
import com.gaming.gamingplatform.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public Score saveScore(Score score) {
        return scoreRepository.save(score);
    }

    public List<Score> getHighestScores(Long userId) {
        return scoreRepository.findHighestScoresByUserId(userId);
    }
}
