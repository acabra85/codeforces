package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class Elephant617A {
    static public class Solution {
        public static void main(String[] args) {
            System.out.println(solution(new Scanner(System.in).nextInt()));
        }

        static int[] stepSize = {5, 4, 3, 2, 1};
        static int solution(int x) {
            int distance = x;
            int step = 0;
            for (int i = 0; i < stepSize.length && distance > 0; ++i) {
                while((distance - stepSize[i]) >= 0) {
                    distance -= stepSize[i];
                    ++step;
                }
            }
            return step;
        }
    }
}
