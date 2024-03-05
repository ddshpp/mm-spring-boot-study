package org.example.shp.service;

import org.example.shp.domain.Player;
import org.example.shp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getPlayerList() {
        return playerRepository.findAll();
    }
}
