package com.catnbearsoftware.app.SuiteTest;

        import com.catnbearsoftware.app.MessageUtil.MessageUtil;
        import org.junit.Test;
        import static org.junit.Assert.*;

/**
 * Created by Przemek on 22.08.2016.
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
