package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Movie getMovie(){
        Movie movie = new Movie(getActor());
        return movie;
    }

    @Bean
    public Actor getActor(){
        Actor actor = new Actor("Avinash","M",23);
//        actor.setAge(23);
//        actor.setGender("M");
//        actor.setName("Avinash");
        return actor;
    }

}
