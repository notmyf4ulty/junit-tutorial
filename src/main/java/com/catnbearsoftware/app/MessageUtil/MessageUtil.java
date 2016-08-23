package com.catnbearsoftware.app.MessageUtil;

/**
 * Example class to be tested. It prints and returns simple messages.
 */
public class MessageUtil {
    private String message;

    /**
     * Constructor.
     * @param message message to be printed
     */
    public MessageUtil(String message) {
        this.message = message;
    }

    /**
     * Prints the message.
     * @return Message.
     */
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    /**
     * Adds "Hi!" to the message
     * @return message with "Hi" before
     */
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
