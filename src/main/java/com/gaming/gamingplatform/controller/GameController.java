package com.gaming.gamingplatform.controller;

import com.gaming.gamingplatform.dto.Game;
import com.gaming.gamingplatform.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
@CrossOrigin(origins = "http://localhost:3000")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/addgame")
    public Game addGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }

    @GetMapping("/getallgames")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }

    @PutMapping("/updategame/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game gameDetails) {
        return gameService.updateGame(id, gameDetails);
    }

    @DeleteMapping("/deletegame/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
    }
}

