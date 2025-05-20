package com.raian.NexusGames.repositories;

import com.raian.NexusGames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
