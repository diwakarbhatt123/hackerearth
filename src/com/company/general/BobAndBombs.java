package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BobAndBombs {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println(findWallDestroyed(br.readLine()));
        }
    }

    private static Integer findWallDestroyed(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='W'){
                if((i+1<s.length()&&s.charAt(i+1)=='B')||
                        (i+2<s.length()&&s.charAt(i+2)=='B')
                        ||(i-1>=0&&s.charAt(i-1)=='B')
                        ||(i-2>=0&&s.charAt(i-2)=='B')){
                    count++;
                }
            }
        }
        return count;
    }
}
