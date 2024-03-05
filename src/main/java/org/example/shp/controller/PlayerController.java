package org.example.shp.controller;

import lombok.RequiredArgsConstructor;
import org.example.shp.domain.Player;
import org.example.shp.repository.PlayerRepository;
import org.example.shp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping
    public List<Player> getPlayerList() {
        return playerService.getPlayerList();
    }
}
