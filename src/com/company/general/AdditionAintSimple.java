package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdditionAintSimple {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println(addReverse(br.readLine()));
        }
    }

    private static String addReverse(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append((char) (s.charAt(i)+reverse.charAt(i)));
        }
        return result.toString();
    }
}
