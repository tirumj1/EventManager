package com.eventmanager.app.exception;

/**
 * User defined exception class in case if the event not found
 * @author  JT
 * @Version 1
 */
public class NoEventFoundExcepttion extends Exception{

    public NoEventFoundExcepttion(String errorMessage) {
        super(errorMessage);
    }
}
