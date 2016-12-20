package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class War {
    public static void main(String args[]) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            int arrLength = Integer.parseInt(br.readLine());
            System.out.println(getWinner(br.readLine().split(" "), br.readLine().split(" ")));
        }
    }

    private static String getWinner(String[] bob, String[] alice) {
        String winner = "";
        int maxBob = Integer.parseInt(bob[0]);
        int maxAlice = Integer.parseInt(alice[0]);
        for (int i = 1; i < bob.length; i++) {
            maxBob = Math.max(Integer.parseInt(bob[i]), maxBob);
        }
        for (int j = 1; j < alice.length; j++) {
            if (Integer.parseInt(alice[j]) > maxAlice) {
                maxAlice = Math.max(Integer.parseInt(alice[j]), maxAlice);
            }
        }
        return (maxBob == maxAlice) ? "Tie" : ((maxAlice > maxBob) ? "Alice" : "Bob");
    }
}
