package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

public class LoveA1146ATest {

    @Test
    public void should_return_6() {
        Assert.assertEquals(6, LoveA1146A.Solution.solution("aaafaa"));
    }

    @Test
    public void should_return_3() {
        Assert.assertEquals(3, LoveA1146A.Solution.solution("xaxxxxa"));
    }

    @Test
    public void should_return_5() {
        Assert.assertEquals(5, LoveA1146A.Solution.solution("aabbbbabbbbb"));
    }
}