package com.gaming.gamingplatform.service;

import com.gaming.gamingplatform.dto.Score;
import com.gaming.gamingplatform.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public Score saveScore(Score score) {
        return scoreRepository.save(score);
    }

    public List<Score> getHighestScores(Long userId) {
        // Implement your logic to get the highest scores for the given userId
        return null;
    }

    public Score updateScore(Long id, Score updatedScore) {
        Optional<Score> existingScoreOptional = scoreRepository.findById(id);
        if (existingScoreOptional.isPresent()) {
            Score existingScore = existingScoreOptional.get();
            existingScore.setUser(updatedScore.getUser());
            existingScore.setGame(updatedScore.getGame());
            existingScore.setScore(updatedScore.getScore());
            return scoreRepository.save(existingScore);
        } else {
            throw new RuntimeException("Score not found with id: " + id);
        }
    }

    public void deleteScore(Long id) {
        scoreRepository.deleteById(id);
    }

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }
}
