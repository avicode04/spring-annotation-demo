package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    Actor actor;

    public Actor getActor() {
        return actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getDisplay(){
        System.out.println("Movie on display..");
        actor.display();
    }

}
