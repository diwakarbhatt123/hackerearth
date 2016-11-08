package com.company.general;

import java.util.Scanner;

public class GreatKian {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int numbers[] = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = s.nextInt();
        }
        for(int i=0;i<N;i++){
            int temp = i;
            int sum = 0;
            while(temp<=N-1){
                sum += numbers[temp];
                temp+=3;
            }
            System.out.print(sum);
        }
    }
}
