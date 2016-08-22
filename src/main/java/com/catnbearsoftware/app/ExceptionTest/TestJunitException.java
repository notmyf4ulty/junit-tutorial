package com.catnbearsoftware.app.ExceptionTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Przemek on 22.08.2016.
 */
public class TestJunitException {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
//        int a = 3/0; // It works :)
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
