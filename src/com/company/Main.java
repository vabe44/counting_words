package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String sentence, s, s1, s2;
        int l, l1, l2;
        double NumUser;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        s = sentence.toLowerCase();
        l = s.length();
        System.out.print("Enter a number between 0 and 1: ");
        NumUser = input.nextDouble();

        double randomNum = Math.random();
        System.out.println(randomNum);

        if(randomNum < NumUser)
        {
            //counting words starting with 'p'
            s1 = s.replace(" p", "");
            l1 = s1.length();
            if(s.charAt(0)=='p')
            {
                System.out.println("Number of words starting with 'p' is: " + (1+(l-l1)/2));
            }
            else
            {
                System.out.println("Number of words starting with 'p' is: " + (l-l1)/2);
            }
        }
        else
        {
            //counting words containing 'PET'
            s2 = s.replace("pet", "");
            l2 = s2.length();
            System.out.println("Number of words containing the string 'pet' is: " + (l-l2)/3);

        }

    }
}
