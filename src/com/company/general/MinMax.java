package com.company.general;

import java.util.Scanner;

public class MinMax {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num[] = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(findMinMax(num));
    }

    private static String findMinMax(int[] a) {
        int max = Math.max(a[0],a[1]);
        int min = Math.min(a[0],a[1]);
        for (int i = 2; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
            else if (a[i]<min){
                min = a[i];
            }
            else if (!(a[i]>min) && !(a[i]<max)){
                return "NO";
            }
        }
        return "YES";
    }
}
