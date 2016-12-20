package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ChessTournament {
    private static Map<String, Integer> result = new HashMap<String, Integer>();

    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= Math.pow(2, N) - 1; i++) {
            String outcomes[] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < outcomes.length; j++) {
                String key = i + 1 + "/" + (j + 1);
                result.put(key, Integer.parseInt(outcomes[j]));
            }
        }
        System.out.println(findWinner(N));
    }

    private static Integer findWinner(Integer rounds) {
        List<Integer> winnerList = new ArrayList<Integer>();
        int noOfPlayers = (int) Math.pow(2,rounds);
        for (int i = 1; i <=noOfPlayers; i++) {
            winnerList.add(i);
        }
        for (int i = 1; i <= rounds; i++) {
            List<Integer> roundResults =  new ArrayList<>();
            for (int k = 0; k < winnerList.size(); k += 2) {
                if (result.get(winnerList.get(k+1)+ "/" + winnerList.get(k)) == 1) {
                    roundResults.add(winnerList.get(k+1));
                } else if (result.get(winnerList.get(k+1)+ "/" + winnerList.get(k)) == 0) {
                    roundResults.add(winnerList.get(k));
                }
            }
            noOfPlayers = noOfPlayers / 2;
            winnerList = new ArrayList<>(roundResults);
        }
        return winnerList.get(winnerList.size()-1);
    }
}
