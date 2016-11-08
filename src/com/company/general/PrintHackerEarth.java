package com.company.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrintHackerEarth {
    static Integer count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        String str = bufferedReader.readLine();
        Integer count = hackerEarthCombination(str);
        System.out.println(count);
    }

    private static Integer hackerEarthCombination(String str) {
        if(str.length()<"hackerearth".length()) return 0;
        Map<Character, Integer> characterCount = getMap(str);
        Map<Character, Integer> toFindMap = getMap("hackerearth");

        int result = 0;
        boolean flag = true;
        while (flag) {
            flag = true;
            for (Map.Entry<Character, Integer> entry : toFindMap.entrySet()) {
                if (characterCount.get(entry.getKey()) >= entry.getValue())
                    characterCount.put(entry.getKey(), (characterCount.get(entry.getKey()) - entry.getValue()));
                else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                result++;
        }
        return result;
    }

    private static Map<Character,Integer> getMap(String str) {
        Map<Character, Integer> characterCount = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (characterCount.containsKey(str.charAt(i))) {
                characterCount.put(str.charAt(i), characterCount.get(str.charAt(i)) + 1);
            } else {
                characterCount.put(str.charAt(i), 1);
            }
        }
        return characterCount;
    }
}