package com.catnbearsoftware.app.UsingAssertion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class to test super basics of the assertions.
 */
public class AssertionSuperBasic {
    @Test
    public void testAdd() {
        String str = "hello";
        int num = 4;

        assertEquals("hello",str);
        assertNotNull(str);
        assertFalse(num > 6);
    }
}
