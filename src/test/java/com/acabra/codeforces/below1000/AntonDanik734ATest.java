package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

public class AntonDanik734ATest {

    @Test
    public void should_return_A() {
        Assert.assertEquals(AntonDanik734A.Solution.A, AntonDanik734A.Solution.solution(6, "ADAAAA"));
    }

    @Test
    public void should_return_D() {
        Assert.assertEquals(AntonDanik734A.Solution.D, AntonDanik734A.Solution.solution(7, "DDDAADA"));
    }

    @Test
    public void should_return_F() {
        Assert.assertEquals(AntonDanik734A.Solution.F, AntonDanik734A.Solution.solution(6, "DADADA"));
    }

}