package com.example.springspring2.conf;

import com.example.springspring2.model.AwayTeam;
import com.example.springspring2.model.Game;
import com.example.springspring2.model.HomeTeam;
import com.example.springspring2.model.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:team.properties")
@Configuration
public class AppConfig {

    @Bean(name ="home", initMethod="prepTeam", destroyMethod = "destroy")
    public Team homeTeam(@Value("${team.home.city:'Toronto'}") String city, @Value("${team.home.name:'Raptors'}") String name)
    {
        return new HomeTeam(city, name);
    }

    @Bean(name ="away", initMethod="prepTeam", destroyMethod = "destroy")
    public Team awayTeam(@Value("${team.away.city:'Toronto'}") String city, @Value("${team.away.name:'Raptors'}") String name)
    {
        return new AwayTeam(city, name);
    }

//
//    @Bean
//    public Game game(){
//        return new Game();
//    }
}
