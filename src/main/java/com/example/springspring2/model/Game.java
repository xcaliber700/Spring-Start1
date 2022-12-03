package com.example.springspring2.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Game {

    private Team home;
    private Team away;

    public Game(@Qualifier("home") Team team1,@Qualifier("away") Team team2){
        this.home = team1;
        this.away = team2;
    }

    public Team playGame(){

        return Math.random()>0.5? home:away;

    }
}
