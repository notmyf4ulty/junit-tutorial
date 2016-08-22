package com.catnbearsoftware.app.ParametrizedTest;

/**
 * Created by Przemek on 22.08.2016.
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}