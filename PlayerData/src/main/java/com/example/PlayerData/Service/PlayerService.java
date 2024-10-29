package com.example.PlayerData.Service;


import com.example.PlayerData.Repository.PlayerRepository;
import com.example.PlayerData.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    // Save player data
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    // Retrieve top 10 players based on runs
    public List<Player> getTopPlayers() {
        return playerRepository.findTop10ByOrderByRunsDesc();
    }

    // Search players by name or team
    public List<Player> searchPlayers(String search) {
        return playerRepository.findByNameContainingOrTeamContaining(search, search);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void deletePlayerById(Long id) {
        playerRepository.deleteById(id);
    }
}
