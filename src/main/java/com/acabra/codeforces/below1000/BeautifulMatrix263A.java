package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class BeautifulMatrix263A {
    static public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int moves = -1;
            for (int i = 1; i <= 5 && -1 == moves; ++i) {
                for (int j = 1; j <= 5; ++j) {
                    if (scanner.nextInt() == 1) {
                        moves = solution(i, j);
                        break;
                    }
                }
            }
            System.out.println(moves);
        }

        static int solution(int i, int j) {
            return Math.abs(3 - i) + Math.abs(3 - j);
        }

    }
}
