package com.company.general;

import java.util.Scanner;

public class DigitProblem {
    static int count=0;
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        String digit_change=sc.nextLine();
        String s_digit=digit_change.split(" ")[0];
        int temp=digit_change.split(" ")[0].length();
        int[] digit=new int[temp];
        long change=Long.parseLong(digit_change.split(" ")[1]);
        for(int i=0;i<temp;i++){
            digit[i]=s_digit.charAt(i)-'0';
        }
        for(int i=0;i<temp;i++){
            if(digit[i]<9){
                if(count<change)
                    digit[i]=9;
                count+=1;
            }
        }
        for(int temp1:digit)
            System.out.print(temp1);
    }
}
