package com.stackroute.domain;

public class Actor {

    private String actorname;
    private int actorage;
    private String actorgenger;

    public Actor(String actorname, int actorage, String actorgenger) {
        this.actorname = actorname;
        this.actorage = actorage;
        this.actorgenger = actorgenger;
    }


    public Actor() {
        System.out.println("Actor");
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public int getActorage() {
        return actorage;
    }

    public void setActorage(int actorage) {
        this.actorage = actorage;
    }

    public String getActorgenger() {
        return actorgenger;
    }

    public void setActorgenger(String actorgenger) {
        this.actorgenger = actorgenger;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorname='" + actorname + '\'' + ", actorage=" + actorage + ", actorgenger='" + actorgenger + '\'' + '}';
    }


}


