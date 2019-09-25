package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBranch;
import com.stackroute.demo.BeanProcessorDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBranch getLife(){
        BeanLifecycleDemoBranch life = new BeanLifecycleDemoBranch();
        return life;
    }

    @Bean(value="movie1")
    public Movie getMovie1(){
        Movie movie = new Movie(getActor1());
        return movie;
    }

    @Bean(value="movie2")
    public Movie getMovie2(){
        Movie movie = new Movie(getActor2());
        return movie;
    }

    @Bean
    public Actor getActor1(){
        Actor actor1 = new Actor("Akshay","M",48);
//        actor.setAge(70);
//        actor.setGender("M");
//        actor.setName("Amitabh");
        return actor1;
    }

    @Bean
    public Actor getActor2(){
        Actor actor2 = new Actor("Shahrukh","M",50);
//        actor.setAge(50);
//        actor.setGender("M");
//        actor.setName("Shahrukh");
        return actor2;
    }

    @Bean
    public BeanPostProcessor getBeanPost(){
        BeanPostProcessor beanPostProcessor=new BeanProcessorDemo();
        return beanPostProcessor;
    }

}
