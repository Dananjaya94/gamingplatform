package com.gaming.gamingplatform.service;

import com.gaming.gamingplatform.dto.Game;
import com.gaming.gamingplatform.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    public Game updateGame(Long id, Game gameDetails) {
        return gameRepository.findById(id).map(game -> {
            game.setName(gameDetails.getName());
            game.setDescription(gameDetails.getDescription());
            return gameRepository.save(game);
        }).orElse(null);
    }
}

