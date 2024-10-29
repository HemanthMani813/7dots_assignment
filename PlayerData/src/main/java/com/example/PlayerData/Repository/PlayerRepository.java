package com.example.PlayerData.Repository;


import com.example.PlayerData.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    // To get top 10 players based on runs
    List<Player> findTop10ByOrderByRunsDesc();

    // To search players by name or team
    List<Player> findByNameContainingOrTeamContaining(String name, String team);
}
