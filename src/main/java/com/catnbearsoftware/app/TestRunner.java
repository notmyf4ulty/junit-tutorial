package com.catnbearsoftware.app;

import com.catnbearsoftware.app.ParametrizedTest.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Main class. Change name in the runClasses method and import statements to test particular packages.
 */
public class TestRunner {
   public static void main(String[] args) {
       Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);

       for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
       }

       System.out.println(result.wasSuccessful());
   }
}  	