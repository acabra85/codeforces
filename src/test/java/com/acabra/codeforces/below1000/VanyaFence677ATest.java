package com.acabra.codeforces.below1000;

import com.acabra.codeforces.utils.Helper;
import org.junit.Assert;
import org.junit.Test;

public class VanyaFence677ATest {
    @Test
    public void should_return_4(){
        Assert.assertEquals(4, VanyaFence677A.Solution.solution(Helper.getScannerFromFile("below1000/677A_0.txt")));
    }
    @Test
    public void should_return_6(){
        Assert.assertEquals(6, VanyaFence677A.Solution.solution(Helper.getScannerFromFile("below1000/677A_1.txt")));
    }
    @Test
    public void should_return_11(){
        Assert.assertEquals(11, VanyaFence677A.Solution.solution(Helper.getScannerFromFile("below1000/677A_2.txt")));
    }
}