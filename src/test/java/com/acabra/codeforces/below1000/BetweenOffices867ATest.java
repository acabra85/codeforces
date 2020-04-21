package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

public class BetweenOffices867ATest {
    @Test
    public void should_return_yes_0() {
        Assert.assertEquals("YES", BetweenOffices867A.Solution.solution(2, "SF"));
    }
    @Test
    public void should_return_yes_1() {
        Assert.assertEquals("YES", BetweenOffices867A.Solution.solution(10, "SSFFSFFSFF"));
    }
    @Test
    public void should_return_no_0() {
        Assert.assertEquals("NO", BetweenOffices867A.Solution.solution(4, "FSSF"));
    }
    @Test
    public void should_return_no_1() {
        Assert.assertEquals("NO", BetweenOffices867A.Solution.solution(4, "FFFFFFFFFF"));
    }
}