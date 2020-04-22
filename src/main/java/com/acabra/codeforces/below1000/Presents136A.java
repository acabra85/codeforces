package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class Presents136A {
    static public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(solution(scanner.nextInt(), scanner));
        }

        static String solution(int n, Scanner scanner) {
            int[] receiveGiftFrom = new int[n];
            for (int i = 0; i < n; ++i) {
                receiveGiftFrom[scanner.nextInt() - 1] = i + 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; ++i) {
                sb.append(receiveGiftFrom[i]);
                if (i < n - 1) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }
}
