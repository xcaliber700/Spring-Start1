package com.example.springspring2.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class HomeTeam implements Team{
    private final String country;
    private final String teamName;

    @Override
    public String team() {
        return country + " " + teamName;
    }

    public void prepTeam(){
        log.info("HOME IS GETTING READY FOR GAME.....");
    }

    public void destroy(){
        log.info("HOME IS DONE FOR WITH GAME.....");
    }
}
