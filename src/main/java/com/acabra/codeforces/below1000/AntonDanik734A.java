package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class AntonDanik734A {
    static public class Solution {
        static String A = "Anton";
        static String D = "Danik";
        static String F = "Friendship";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(solution(scanner.nextInt(), scanner.next()));
        }

        static String solution(int x, String next) {
            int anton = 0;
            for (char c: next.toCharArray()) {
                if(c == 'A') {
                    ++anton;
                }
            }
            int danik = x - anton;
            if (anton > danik) {
                return A;
            }
            return danik > anton ? D : F;
        }
    }
}
