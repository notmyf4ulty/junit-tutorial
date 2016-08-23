package com.catnbearsoftware.app.TimeTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test @Test's "timeout" parameter
 */
public class TestJunitTime {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(timeout = 5000)
    public void testPrintMessage() {
        while(true) {
            System.out.print(".");
        }
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
