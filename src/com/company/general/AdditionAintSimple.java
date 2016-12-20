package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AdditionAintSimple {
    private static Map<Character,Map<Integer,Character>> integerMapHashMap = new HashMap<>();
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        char a = 'a';
        for (int i = 1; i <= 26; i++) {
            Map<Integer,Character> characterIntegerMap = new HashMap<>();
            characterIntegerMap.put(i,a);
            integerMapHashMap.put(a++,characterIntegerMap);
        }
        for (int i = 0; i < N; i++) {
            System.out.println(addReverse(br.readLine()));
        }
    }

    private static String addReverse(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
//            int sum = integerMapHashMap.get(s.charAt(i));
        }
        return result.toString();
    }
}
