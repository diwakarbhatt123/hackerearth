package com.company.general;

import java.util.Scanner;

public class StringSum {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            int val = (int)input.charAt(i)-96;
            sum+=val;
        }
        System.out.println(sum);
    }
}
