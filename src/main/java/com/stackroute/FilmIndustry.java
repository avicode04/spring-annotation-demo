package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FilmIndustry {

    public static void main(String args[]){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded..");
        Movie movie = factory.getBean(Movie.class);
        movie.getDisplay();

        Movie movie2 = factory.getBean(Movie.class);
        movie.getDisplay();

        System.out.println(movie==movie2);

    }
}
