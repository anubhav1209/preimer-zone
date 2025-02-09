package com.pl.preimer_zone.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    public List<Player> getPlayerFromTeam(String teamName){
        return playerRepository.findAll()
                .stream().filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByName(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getName().toLowerCase(Locale.ROOT).contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayerByPosition(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByNation(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayersByTeamAndPosition(String team , String position){
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam())& position.equals(player.getPosition()))
                .collect(Collectors.toList());

    }
    public Player addPlayer(Player player){
        playerRepository.save(player);
        return player;
    }

    public Player UpdatePlayer(Player updatedPlayer){
        Optional<Player> existingPlayer = playerRepository.findByName(updatedPlayer.getName());
        if(existingPlayer.isPresent()){
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPosition((updatedPlayer.getPosition()));
            playerToUpdate.setNation(updatedPlayer.getNation());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    @Transactional
    public void deletePlayer(String playerName){
        playerRepository.deleteByName(playerName);
    }

}
