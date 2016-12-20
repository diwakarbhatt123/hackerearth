package com.company.general;

import java.util.Scanner;

public class SamuAndCard {
    public static void main(String[] args) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int dimensions[] = new int[2];
        int k;
        int cards[][];
        for (int i = 0; i < N; i++) {
            dimensions[0] = s.nextInt();
            dimensions[1] = s.nextInt();
            k = s.nextInt();
            cards = new int[k][2];
            for (int j = 0; j < k; j++) {
                cards[j][0] = s.nextInt();
                cards[j][1] = s.nextInt();
            }
            System.out.println(getCount(cards,dimensions,k));
        }
    }

    private static int getCount(int[][] cards, int[] dimensions,int k) {
        int[] position = {1,1};
        int count=0;
        for (int i = 0; i < k; i++) {
            int card[] = cards[i];
            while ((position[0]+card[0]<=dimensions[0]&&position[0]+card[0]>0)&&(position[1]+card[1]<=dimensions[1])&&position[1]+card[1]>0){
                position[0]+=card[0];
                position[1]+=card[1];
                count++;
            }
        }
        return count;
    }
}
