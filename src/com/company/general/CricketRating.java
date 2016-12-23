package com.company.general;

import java.util.Scanner;

public class CricketRating {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int performence[] = new int[N];
        for (int i = 0; i < N; i++) {
            performence[i] = s.nextInt();
        }
        System.out.println(findMaxRating(performence));
    }

    private static int findMaxRating(int performence[]) {
        int maxEndingHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < performence.length; i++) {
            maxEndingHere = Math.max(0,maxEndingHere+performence[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}
