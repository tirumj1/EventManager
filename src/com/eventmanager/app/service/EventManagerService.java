package com.eventmanager.app.service;

import com.eventmanager.app.bean.EventInputBean;
import com.eventmanager.app.bean.EventResponseBean;
import com.eventmanager.app.exception.NoEventFoundExcepttion;

import java.util.List;

public interface EventManagerService {

    public List<EventResponseBean> getMatchingEvents(EventInputBean eventInputBean) throws NoEventFoundExcepttion;
}
