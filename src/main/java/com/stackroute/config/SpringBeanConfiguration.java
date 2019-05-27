package com.stackroute.config;

import com.stackroute.awareinterface.ApplicationContextAwareDemo;
import com.stackroute.awareinterface.BeanFactoryAwareDemo;
import com.stackroute.awareinterface.BeanNameAwareDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
   @Bean(name="actor")
    public Actor getActor() {
        Actor actor = new Actor();
        actor.setActorname("prasanna");
        actor.setActorage(23);
        actor.setActorgenger("female");
        return actor;
    }

    @Bean(name = "movie")
    public Movie getMovie() {
        return new Movie();
    }
    @Bean(name="applicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo() {
        return new ApplicationContextAwareDemo();
    }
    @Bean(name= "BeanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
       return new BeanFactoryAwareDemo();
    }

    @Bean(name= "BeanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
        return new BeanNameAwareDemo();
    }








/*  @Bean(name = "movie1")
    public Movie getActor2() {
        Actor actor = new Actor("prasanna", 23, "female");
        return new Movie(actor);
    }*/
    /*@Bean(name = "movie2")
    public Movie getActor3() {
        Actor actor = new Actor("srihari", 23, "male");
        return new Movie(actor);*/
    }

