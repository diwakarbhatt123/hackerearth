package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyLifeCycle {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String data[] = new String[N];
        for (int i = 0; i < N; i++) {
            data[i] = br.readLine();
        }
        findStreak(data);
    }

    private static void findStreak(String[] data) {
        int longestCodingStreakOneDay = 0 ;
        int longestStreak = 0;
        int tempLongestStreak = 0;
        for (int i = 0; i < data.length; i++) {
            char []daydata = data[i].toCharArray();
            int count = 0;
            for (int j = 1; j <daydata.length; j++) {
                if(daydata[j-1]=='C'&&daydata[j]=='C'){
                    count++;
                    tempLongestStreak++;
                }
                if(daydata[j-1]=='C'&&daydata[j]!='C'||j==daydata.length-1) {
                    count++;
                    if(j!=daydata.length-1) {
                        tempLongestStreak++;
                        longestStreak = (tempLongestStreak > longestStreak) ? tempLongestStreak : longestStreak;
                        tempLongestStreak = 0;
                    }
                    longestCodingStreakOneDay = (count>longestCodingStreakOneDay)?count:longestCodingStreakOneDay;
                    count = 0;
                }
            }
        }
        System.out.println(longestCodingStreakOneDay+" "+longestStreak);
    }
}
