package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

public class Elephant617ATest {
    @Test
    public void should_return_3(){
        Assert.assertEquals(3, Elephant617A.Solution.solution(12));
    }

    @Test
    public void should_return_1(){
        Assert.assertEquals(1, Elephant617A.Solution.solution(5));
    }
}