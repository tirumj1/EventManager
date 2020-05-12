package com.eventmanager.app.bean;

import java.io.Serializable;

/**
 * This POJO is used to get the user specified information as in input to the REST resource
 * @author JT
 * @version 1
 */
public class EventInputBean implements Serializable {
    private String owner;
    private String repo;
    private String eventType;

    public EventInputBean(String owner, String repo, String eventType) {
        this.owner = owner;
        this.repo = repo;
        this.eventType = eventType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "EventInputBean{" +
                "owner='" + owner + '\'' +
                ", repo='" + repo + '\'' +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
