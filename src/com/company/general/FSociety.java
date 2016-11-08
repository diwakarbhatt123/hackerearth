package com.company.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FSociety {

    public static void main(String args[]) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            StringBuilder rawString = new StringBuilder(br.readLine());
            Integer rotN = 13;
            char encodedString[] = new char[rawString.length()];
            for (int j = 0; j < rawString.length(); j++) {
                encodedString[j] = getCharacterAfterNTerm(rawString.substring(0,j),rawString.charAt(j));
            }
            System.out.println(new String(encodedString));
        }
    }
    private static char getCharacterAfterNTerm(String stringBefore, char originalCharacter) {
        if (stringBefore.contains(originalCharacter + "")) {
           Integer rotN  =  findNoOfOccurence(stringBefore,originalCharacter) + 13;
            return normalizeCharacter(originalCharacter,rotN);
        }
        else {
            return normalizeCharacter(originalCharacter,13);
        }
    }

    private static Integer findNoOfOccurence(String stringBefore, char originalCharacter) {
          Integer counter = 0;
        for (int i = 0; i < stringBefore.length(); i++) {
            if(stringBefore.charAt(i) == originalCharacter)
            {
                counter++;
            }
        }
        return counter;
    }

    private static char normalizeCharacter(char originalCharacter,int position){
        if ( (originalCharacter >= 'a') && (originalCharacter <= 'z') )
            return (char) ((((originalCharacter-'a')+position)%26)+'a');
        else
        return 'a';
    }
}
