package com.catnbearsoftware.app;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.catnbearsoftware.app.WritingATests.*;

public class TestRunner {
   public static void main(String[] args) {
       Result result = JUnitCore.runClasses(TestEmployeeDetails.class);

       for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
       }

       System.out.println(result.wasSuccessful());
   }
}  	