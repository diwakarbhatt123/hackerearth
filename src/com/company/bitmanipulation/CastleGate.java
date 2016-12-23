package com.company.bitmanipulation;

import java.util.Scanner;

public class CastleGate {
    public static void main(String args[]) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(findPairs(s.nextInt()));
        }
    }

    private static int findPairs(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            for (int j = i + 1; j <= number; j++) {
                if ((i ^ j) <= number) {
                    count++;
                }
            }
        }
        return count;
    }
}
