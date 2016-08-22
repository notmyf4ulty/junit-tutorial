package com.catnbearsoftware.app.IgnoreTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Przemek on 22.08.2016.
 */
public class TestJunitIgnore {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Ignore
    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Robert";
        assertEquals(message,messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}