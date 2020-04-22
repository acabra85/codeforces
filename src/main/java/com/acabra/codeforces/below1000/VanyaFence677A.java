package com.acabra.codeforces.below1000;

import java.util.Scanner;

public class VanyaFence677A {
    static public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(solution(scanner));
        }

        static int solution(Scanner scanner) {
            int n = scanner.nextInt();
            int wallHeight = scanner.nextInt();
            int roadWidth = 0;
            for (int i = 0; i < n; ++i) {
                if (scanner.nextInt() > wallHeight) {
                    roadWidth += 2;
                } else {
                    roadWidth += 1;
                }
            }
            return roadWidth;
        }
    }
}
