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

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Integer stats, Double min, Double goals, Double assits, Double pks, Double yellowCards, Double redCards, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.stats = stats;
        this.min = min;
        this.goals = goals;
        this.assits = assits;
        this.pks = pks;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getStats() {
        return stats;
    }

    public Double getMin() {
        return min;
    }

    public Double getGoals() {
        return goals;
    }

    public Double getAssits() {
        return assits;
    }

    public Double getPks() {
        return pks;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public Double getXg() {
        return xg;
    }

    public Double getXag() {
        return xag;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public void setAssits(Double assits) {
        this.assits = assits;
    }

    public void setPks(Double pks) {
        this.pks = pks;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
