package com.catnbearsoftware.app;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
//       Result result = JUnitCore.runClasses(TestJunit3.class);

       TestSuite suite = new TestSuite(TestJunit.class, TestJunit1.class, TestJunit2.class, TestJunit3.class);
       TestResult result = new TestResult();

       suite.run(result);

       System.out.println("Number of test cases = " + result.runCount());
       System.out.println("Number of errors = " + result.errorCount());
       System.out.println("Number of failures = " + result.failureCount());

//       for (Failure failure : result.getFailures()) {
//           System.out.println(failure.toString());
//       }
//
//       System.out.println(result.wasSuccessful());
   }
}  	