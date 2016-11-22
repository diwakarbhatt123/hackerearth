package com.company.general;

import java.util.Scanner;

public class FinalDestination {
    private static int position[] = {0,0};
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        for (int i = 0; i <input.length(); i++) {
            findPosition(input.charAt(i));
        }
        for (int i = 0; i < position.length; i++) {
            System.out.print(position[i]+" ");
        }
    }

    private static void findPosition(char next) {
        switch (next){
            case 'L':
                position[0] = position[0]-1;
                break;
            case 'R':
                position[0] = position[0]+1;
                break;
            case 'D':
                position[1] = position[1]-1;
                break;
            case 'U':
                position[1] = position[1]+1;
                break;
        }
    }
}
