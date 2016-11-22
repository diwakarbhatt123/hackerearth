package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ChessTournament {
    static Map<String,Integer> result = new HashMap<String, Integer>();
    public static void main(String args[] ) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <=Math.pow(2,N)-1; i++) {
            String outcomes[] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < outcomes.length; j++) {
                String key = i+1+"/"+(j+1);
                result.put(key,Integer.parseInt(outcomes[j]));
            }
        }
        Integer winner = findWinner(N);
    }

    private static Integer findWinner(Integer rounds) {
        List<Integer> winnerList = new ArrayList<Integer>();
        for (int i = 1; i <=rounds; i++) {
            for (int j = 1;j<=Math.pow(rounds,2)/i;j+=2){
                // TODO: 14/11/16 Solve this shit
            }
        }
        return 1;
    }
}
