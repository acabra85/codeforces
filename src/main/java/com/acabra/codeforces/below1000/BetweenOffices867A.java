package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class BetweenOffices867A {
    static public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(solution(scanner.nextInt(), scanner.next()));
        }

        public static String solution(int n, String officeDays) {
            int favorite = 0;
            int other = 0;
            char[] days = officeDays.toCharArray();
            for (int i = 1; i < n; ++i) {
                if(days[i] != days[i-1]) {
                    if (days[i] == 'F')
                        ++favorite;
                    else
                        ++other;
                }
            }
            return favorite > other ? "YES" : "NO";
        }
    }
}
