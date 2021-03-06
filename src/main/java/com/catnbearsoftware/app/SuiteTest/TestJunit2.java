package com.catnbearsoftware.app.SuiteTest;

import com.catnbearsoftware.app.MessageUtil.MessageUtil;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class 2
 */
public class TestJunit2 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}