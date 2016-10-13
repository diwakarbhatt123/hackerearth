package com.company.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrateekAndFriends {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Integer noOfFriends = 0;
        Integer totalAmount = 0;
        String result = "";
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String line2 = br.readLine();
            noOfFriends = Integer.parseInt(line2.split(" ")[0]);
            totalAmount = Integer.parseInt(line2.split(" ")[1]);
            List<Integer> costList = new ArrayList<Integer>();
            for (int j = 0; j < noOfFriends; j++) {
                costList.add(Integer.parseInt(br.readLine()));
            }
            result = canGiveGifts(noOfFriends, totalAmount, costList);
            System.out.println(result);
        }
    }

    private static String canGiveGifts(Integer noOfFriends, Integer totalAmount, List<Integer> costList) {
        Integer sum;
        if (noOfFriends != null || totalAmount != null || costList != null) {
            for (int i = 0; i <= costList.size() - 1; i++) {
                if (costList.get(i).equals(totalAmount)) {
                    return "YES";
                }
                int j = i + 1;
                sum = costList.get(i);
                while (j <= costList.size() - 1 && sum <= totalAmount) {
                    sum += costList.get(j);
                    if (sum.equals(totalAmount)) {
                        return "YES";
                    }
                    j++;
                }
            }
        }
        return "NO";
    }
}
