package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class SuffixTree1281A {
    static public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for (int i = 0; i < t; ++i) {
                System.out.println(solution(scanner.next()));
            }
        }

        static String solution(String word) {
            char last = word.charAt(word.length() - 1);
            if('o' == last) return "FILIPINO";
            if('a' == last) return "KOREAN";
            return "JAPANESE";
        }
    }
}
