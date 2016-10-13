package com.company.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChanduGirlfriend{

    private Integer[] array;

    public static void main(String args[] ) throws Exception {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            Integer arraySize = Integer.parseInt(br.readLine());
            String array[] = br.readLine().split(" ");
            ChanduGirlfriend chanduGirlfriend = new ChanduGirlfriend();
            chanduGirlfriend.array = new Integer[array.length];
            for (int j = 0; j < array.length; j++) {
                chanduGirlfriend.array[j] = Integer.parseInt(array[j]);
            }
            chanduGirlfriend.quickSort(0, array.length - 1);
            for (int j = chanduGirlfriend.array.length-1; j >= 0; j--) {
                System.out.print(chanduGirlfriend.array[j] + " ");
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    private void quickSort(Integer start,Integer end) {
        if (start<end) {
            Integer pivotPosition = partition(start,end);
            quickSort(start,pivotPosition-1);
            quickSort(pivotPosition+1,end);
        }
    }

    private Integer partition(Integer start,Integer end) {
        Integer pivotElement = this.array[start];
        int i = start+1;
        for (int j = start+1; j <= end; j++) {
            if (this.array[j] < pivotElement) {
                Integer temp = this.array[j];
                this.array[j] = this.array[i];
                this.array[i] = temp;
                i++;
            }
        }
        this.array[start] = this.array[i-1];
        this.array[i-1] = pivotElement;
        return i-1;
    }

}
