package com.catnbearsoftware.app.UsingAssertion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Przemek on 19.08.2016.
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