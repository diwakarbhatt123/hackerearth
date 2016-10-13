package com.company.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsecutiveLetters {

    public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        String input = br.readLine();
        StringBuilder string = new StringBuilder(input.substring(0,1));
        for(int j=1;j<=input.length()-1;j++)
        {
            if(input.charAt(j-1) == input.charAt(j))
                continue;
            string.append(input.charAt(j));
        }
        System.out.println(string.toString());
    }
}

}
