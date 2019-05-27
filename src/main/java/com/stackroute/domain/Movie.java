package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    Actor actor;


    public Movie() {
        System.out.println("Movie");
    }
    public  Actor getActor() {
        return actor;
    }
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" + "actor=" + actor + '}';
    }
}