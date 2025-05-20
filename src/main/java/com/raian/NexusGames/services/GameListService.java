package com.raian.NexusGames.services;


import com.raian.NexusGames.dto.GameListDTO;
import com.raian.NexusGames.dto.GameMinDTO;
import com.raian.NexusGames.entities.Game;
import com.raian.NexusGames.entities.GameList;
import com.raian.NexusGames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional (readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
