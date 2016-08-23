package com.catnbearsoftware.app.ExceptionTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunitException {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
//        int a = 3/0; // ArithmeticException works :) Uncomment
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
