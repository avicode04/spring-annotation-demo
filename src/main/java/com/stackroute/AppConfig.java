package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Movie getMovie(){
        Movie movie = new Movie();
        return movie;
    }

    @Bean
    public Actor getActor(){
        Actor actor = new Actor();
        actor.setAge(23);
        actor.setGender("M");
        actor.setName("Avinash");
        return actor;
    }

}
