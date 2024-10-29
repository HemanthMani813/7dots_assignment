package com.example.PlayerData.Controller;


import com.example.PlayerData.Service.PlayerService;
import com.example.PlayerData.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    // 1st API: Create player data
    @PostMapping("/create")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    // 2nd API: Retrieve top 10 players based on runs
    @GetMapping("/top10")
    public List<Player> getTop10Players() {
        return playerService.getTopPlayers();
    }

    // 3rd API: Search players
    @GetMapping("/search")
    public List<Player> searchPlayers(@RequestParam String keyword) {
        return playerService.searchPlayers(keyword);
    }
    // 4th api :get all data
    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    //5th api: delete player
    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerService.deletePlayerById(id);
        return "Player deleted successfully!";
    }
}
