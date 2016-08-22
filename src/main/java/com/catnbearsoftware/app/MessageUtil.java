package com.catnbearsoftware.app;

/**
 * Created by Przemek on 19.08.2016.
 */
public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
