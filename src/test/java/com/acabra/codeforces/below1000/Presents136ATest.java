package com.acabra.codeforces.below1000;

import com.acabra.codeforces.utils.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Presents136ATest {

    @Test
    public void test_1() {
        Scanner scanner = new Scanner(Helper.fileAsStream("below1000/136A_0.txt"));
        Assert.assertEquals("4 1 2 3", Presents136A.Solution.solution(scanner.nextInt(), scanner));
    }

    @Test
    public void test_2() {
        Scanner scanner = new Scanner(Helper.fileAsStream("below1000/136A_1.txt"));
        Assert.assertEquals("1 3 2", Presents136A.Solution.solution(scanner.nextInt(), scanner));
    }

    @Test
    public void test_3() {
        Scanner scanner = new Scanner(Helper.fileAsStream("below1000/136A_2.txt"));
        Assert.assertEquals("1 2", Presents136A.Solution.solution(scanner.nextInt(), scanner));
    }

}