package com.eventmanager.app.processor;

import com.eventmanager.app.bean.EventInputBean;
import com.eventmanager.app.bean.EventResponseBean;
import com.eventmanager.app.exception.NoEventFoundExcepttion;
import com.eventmanager.app.service.EventManagerService;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Autowired;

/**
 * Processor class to verify business logic
 * @version  1
 * @author JT
 */
@Component
public class EventManagerProcessor {

    @Autowired
    EventManagerService service;

    public List<EventResponseBean> getMatchingEvents(EventInputBean eventInput) throws NoEventFoundExcepttion {
        String methodName = "getMatchingEvents";
        logger.debug("Entry into ",methodName);
        return service.getMatchingEvents(eventInput);
        logger.debug("Exit into ", methodName);
   }

    public EventManagerService getService() {
        return service;
    }

}
