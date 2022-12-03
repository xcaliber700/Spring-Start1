package com.example.springspring2.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AwayTeam implements Team{
    private final String country;
    private final String teamName;

    @Override
    public String team() {
        return country + " " + teamName;
    }

    public void prepTeam(){
        log.info("AWAYE IS GETTING READY FOR GAME.....");
    }

    public void destroy(){
        log.info("AWAY IS DONE FOR WITH GAME.....");
    }
}
