package com.gaming.gamingplatform.controller;

import com.gaming.gamingplatform.dto.Score;
import com.gaming.gamingplatform.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
@CrossOrigin (origins = "http://localhost:3000")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping
    public Score saveScore(@RequestBody Score score) {
        return scoreService.saveScore(score);
    }

    @GetMapping("/highest/{userId}")
    public List<Score> getHighestScores(@PathVariable Long userId) {
        return scoreService.getHighestScores(userId);
    }
}