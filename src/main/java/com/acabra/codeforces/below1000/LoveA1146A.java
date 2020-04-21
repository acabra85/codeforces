package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class LoveA1146A {
    static public class Solution {
        public static void main(String[] args) {
            System.out.println(solution(new Scanner(System.in).next()));
        }

        static int solution(String word) {
            char[] chars = word.toCharArray();
            int countA = 0;
            for (int i = 0; i < chars.length; ++i) {
                if (chars[i] == 'a') {
                    ++countA;
                }
            }
            int other = chars.length - countA;
            if (countA > other) {
                return chars.length;
            }
            int remove = (other - countA) + 1;
            return chars.length - remove;
        }
    }
}
