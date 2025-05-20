package com.raian.NexusGames.repositories;

import com.raian.NexusGames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
