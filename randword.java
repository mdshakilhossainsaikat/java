package com.valluk.again;

import java.util.Random;

public class randword {
    public static void main(String[] args) {
        Random rand = new Random();
        int wordNumber = 10;
        String[] words = new String[wordNumber];

        for (int i = 0; i < wordNumber; i++) {
            int charNumber = rand.nextInt(5) + 5;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < charNumber; j++) {
                int asciiNumber = rand.nextInt(26) + 65;
                char cr = (char) asciiNumber;
                sb.append(cr);
                words[i] = sb.toString();
            }
            
        }

        for (int i = 0; i < wordNumber; i++) {
            System.out.println("word " + i + " is: " + words[i]);
        }
    }
}
