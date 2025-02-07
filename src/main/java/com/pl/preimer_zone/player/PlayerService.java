package com.pl.preimer_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    private PlayerService(PlayerRepository playerRepository){
        this.playerRepository=playerRepository;;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }
}
