package com.company.springbook;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CalcSumTest {
    @Test
    public void sumOfNumbers() throws IOException {
        Calculator calculator = new Calculator();
        String filepath = getClass().getResource("numbers.txt").getPath();
        int sum = calculator.calcSum(filepath);
        assertThat(sum, is(10));
    }

}
