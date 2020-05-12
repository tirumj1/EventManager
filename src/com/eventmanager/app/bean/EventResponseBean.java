package com.eventmanager.app.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This POJO is used to get the user required information from GITHub events
 * @author JT
 * @version 1
 */
public class EventResponseBean implements Serializable {

    private String actor;
    private String repo;
    private String eventType;
    //Timestamp at which actor performed the GIT operation
    private Timestamp timestamp;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "EventResponseBean{" +
                "actor='" + actor + '\'' +
                ", repo='" + repo + '\'' +
                ", eventType='" + eventType + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
