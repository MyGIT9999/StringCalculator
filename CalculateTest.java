package com.calculator;
import org.junit.Assert;
import org.junit.Test;


public class CalculateTest {
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        Calculate.add("1,2,3");
        Assert.assertTrue(true);
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculate.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
       Calculate.add("1,X");
    }
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, Calculate.add(""));
    }
}
