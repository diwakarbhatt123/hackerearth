package com.company.sorting;

import java.util.*;

public class PuchiAndLuggage {
    private Integer[] frinedWeights;

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            Integer noOfFriends = s.nextInt();
            PuchiAndLuggage puchiAndLuggage = new PuchiAndLuggage();
            puchiAndLuggage.frinedWeights = new Integer[noOfFriends];
            for (int j = 0; j < noOfFriends; j++) {
                puchiAndLuggage.frinedWeights[j] = s.nextInt();
            }
            List<Integer> futureWeight = puchiAndLuggage.findFutureWeight();
            for (Integer res : futureWeight) {
                System.out.println(res + " ");
            }
            System.out.println();
        }
    }

    private List<Integer> findFutureWeight() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < this.frinedWeights.length; i++) {
            result.add(hasSmallerWeight(frinedWeights[i],i + 1));
        }
        return result;
    }

    private Integer hasSmallerWeight(Integer elememt,Integer i)
    {
        Integer occurence =0;
        for (int j = i; j < frinedWeights.length; j++) {
            if(frinedWeights[j]<elememt){
                occurence++;
            }
        }
        return occurence;
    }
}
