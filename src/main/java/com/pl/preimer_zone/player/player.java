package com.pl.preimer_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name="name",unique = true)
    private String name;
    private String nation ;
    private String position;
    private Integer age;
    private Integer stats;
    private Double min;
    private Double goals;
    private Double assits;
    private Double pks;
    private Double yellowCards;
    private Double redCards;
    private Double xg;
    private Double xag;
    private String team;

}
