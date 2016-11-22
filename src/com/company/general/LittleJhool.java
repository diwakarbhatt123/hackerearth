package com.company.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleJhool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(pshycic(line));
    }

    private static String pshycic(String line){
        Integer count = 0;
        for (int i = 0; i < line.length()-1; i++) {
            if(line.charAt(i)==line.charAt(i+1)){
                count++;
            }
            else {
                count = 0;
            }
            if (count==5){
                return "Sorry, sorry!";
            }
        }
        return "Good luck!";
    }
}
