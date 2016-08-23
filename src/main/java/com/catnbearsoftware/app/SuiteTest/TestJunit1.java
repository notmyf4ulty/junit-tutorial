package com.catnbearsoftware.app.SuiteTest;

        import com.catnbearsoftware.app.MessageUtil.MessageUtil;
        import org.junit.Test;
        import static org.junit.Assert.*;

/**
 * Test class 1
 */
public class TestJunit1 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
