package com.eventmanager.app.resource;

import com.eventmanager.app.bean.EventInputBean;
import com.eventmanager.app.bean.EventResponseBean;
import com.eventmanager.app.exception.NoEventFoundExcepttion;
import com.eventmanager.app.processor.EventManagerProcessor;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Autowired;



/**
 * This REST resource has common path /events and represents git hub events tracking resource
 * @author JT
 * @version 1
 */


@Path("/events")
@Produces("application/json")
public class EventManagerResource {

    @Autowired
    EventManagerProcessor processor;

    // Using post API to get the event data as the input parameters are three and
    // get can accommodate length of 255 characters in URL. Repo can be a long string in this case
    @POST
    @Consumes("application/json")
    public Response getEvents(EventInputBean input){
        String methodName =  "getEvents";
        logger.debug("entry into ", methodName);
        try {
            List<EventResponseBean> responses = processor.getMatchingEvents(input);
            return Response.status(javax.ws.rs.core.Response.Status.ok).entity(responses).build();
        } catch (NoEventFoundExcepttion noEventFoundExcepttion) {
            logger.error("there are no matching events found for the owner {} , repo {}, " +
                    "event type {}", input.getOwner(), input.getRepo(), input.getEventType());
            return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST).entity(new Message("No Matching events found")).build();
        } catch(Exception exception) {
            logger.error("unexpected runtime error while finding matching events for the owner {} , repo {}, " +
                    "event type {}", input.getOwner(), input.getRepo(), input.getEventType());
            return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST).entity(new Message("Unknown Exception")).build();
        }
        logger.debug("exit from ", methodName);

    }
}
