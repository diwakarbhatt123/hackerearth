package com.company.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TerribleChandu {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
            StringBuffer stringBuffer = new StringBuffer(reader.readLine());
            System.out.println(stringBuffer.reverse().toString());
        }
    }

}
