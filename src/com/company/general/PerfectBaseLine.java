package com.company.general;

import java.util.Scanner;

public class PerfectBaseLine {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int n = s.nextInt();
            String names[] = new String[n];
            int k = s.nextInt();
            for (int j = 0; j < n; j++) {
                names[j] = s.next();
            }
            findPerfectBaseLine(names,k);
        }
        }

    private static void findPerfectBaseLine(String[] names, int k) {
        char perfectBaseLine[] = new char[k];
        for (int i = 0; i < names.length; i++) {
            char name[] = names[i].toCharArray();
            for (int j = 0; j < k; j++) {
                
            }
        }
    }
}
