package com.catnbearsoftware.app.TimeTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Przemek on 22.08.2016.
 */
public class TestJunitTime {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(timeout = 5000) //IT WORKS! :D
    public void testPrintMessage() {
        while(true) {
            System.out.print(".");
        }
//        System.out.println("Inside testPrintMessage()");
//        message = "Robert";
//        assertEquals(message,messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
