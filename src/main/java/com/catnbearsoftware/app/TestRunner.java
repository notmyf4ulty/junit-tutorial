package com.catnbearsoftware.app;

import com.catnbearsoftware.app.TimeTest.TestJunitTime;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
       Result result = JUnitCore.runClasses(TestJunitTime.class);

       for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
       }

       System.out.println(result.wasSuccessful());
   }
}  	