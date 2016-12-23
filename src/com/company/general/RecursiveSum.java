package com.company.general;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveSum {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            int n = s.nextInt();
            BigInteger numberBlocks[][] = new BigInteger[n][2];
            for (int j = 0; j < n; j++) {
                numberBlocks[j][0] = s.nextBigInteger();
                numberBlocks[j][1] = s.nextBigInteger();
            }
            System.out.println(findSum(numberBlocks));
        }
    }

    private static BigInteger findSum(BigInteger[][] numberBlocks) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < numberBlocks.length; i++) {
            sum = sum.add(numberBlocks[i][0].multiply(numberBlocks[i][1]));
            if(sum.compareTo(BigInteger.valueOf(10))==0||sum.compareTo(BigInteger.valueOf(10))==1){
                BigInteger tempSum = BigInteger.ZERO;
                while (sum.compareTo(BigInteger.valueOf(10))==0||sum.compareTo(BigInteger.valueOf(10))==1) {
                    while (sum.compareTo(BigInteger.valueOf(0))!=0) {
                        BigInteger digit = sum.mod(BigInteger.valueOf(10));
                        tempSum = tempSum.add(digit);
                        sum = sum.divide(BigInteger.valueOf(10));
                    }
                    sum = tempSum;
                    tempSum = BigInteger.ZERO;
                }
            }
        }
        return sum;
    }
}
