package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
@Bean(name = "movie")
    public Movie getActor(){
    Actor actor=new Actor("prasanna",23,"female");
    return new Movie(actor);
}

}
