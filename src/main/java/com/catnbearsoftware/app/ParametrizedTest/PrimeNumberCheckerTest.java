package com.catnbearsoftware.app.ParametrizedTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

/**
 * Example class to be tested.
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    /**
     * Each parameter should be placed as an argument here
     * Every time runner triggers, it will pass the arguments
     * from parameters we defined in primeNumbers() method
     * @param inputNumber Numer to be checked if it's prime.
     * @param expectedResult Result.
     */
    public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        });
    }

    /**
     * This test will run 4 times since we have 5 parameters defined
     */

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }
}
