package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeautifulMatrix263ATest {
    @Test
    public void should_return_3() throws IOException {
        FafaCompany935.Solution.Help help = FafaCompany935.Solution.Help.of("below1000/263A_0.txt");
        int solution = -1;
        for (int i = 0; i < 5 && solution == -1; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (help.nInt() == 1) {
                    solution = BeautifulMatrix263A.Solution.solution(i+1, j+1);
                    break;
                }
            }
        }
        Assert.assertEquals(3, solution);
    }

    @Test
    public void should_return_1() throws IOException {
        FafaCompany935.Solution.Help help = FafaCompany935.Solution.Help.of("below1000/263A_1.txt");
        int solution = -1;
        for (int i = 0; i < 5 && solution == -1; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (help.nInt() == 1) {
                    solution = BeautifulMatrix263A.Solution.solution(i+1, j+1);
                    break;
                }
            }
        }
        Assert.assertEquals(1, solution);
    }
}