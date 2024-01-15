package com.mycompany.guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    

    public static void main(String[] args) 
    {
         int min_range = 1;
         int max_range = 100;
         int max_attemp = 15;
         int max_round = 1;
         
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 1");
        System.out.println("Attempts To Guess Number In Each Round : 15\n");
        
        Random r = new Random();
        Scanner sr = new Scanner(System.in);
        int totalscore = 0;

        
        for (int i = 1; i <= max_round; i++) 
        {
            int number = r.nextInt(max_range);
            int attempt = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, min_range, max_range,max_attemp);
            
            while (attempt < max_attemp) 
            {
                System.out.println("Enter your guess : ");
                int guess_number = sr.nextInt();
                attempt = attempt + 1;

                if (guess_number == number) 
                {
                    int score = max_attemp - attempt;
                    totalscore = totalscore + score;
                    System.out.printf("Random Number is Guessed Successfully.");
                    System.out.printf("Total no of Attempts = %d",attempt); 
                    System.out.printf("Round Score = %d\n", score);
                    break;
                }

                else if (guess_number < number) 
                {
                    System.out.printf("The Random number is greater than %d\n", guess_number);
                    System.out.printf("No of Attemps left is %d\n", max_attemp - attempt);
                }

                else if (guess_number > number) 
                {
                    System.out.printf("The Random number is less than %d\n", guess_number);
                    System.out.printf("No of Attemps left is %d\n", max_attemp - attempt);
                }

            }

            if (attempt == max_attemp) 
            {
                System.out.printf("\nTotal no of Round is = %d\n", i);
                System.out.println("Total no of Attempts remaining is = 0");
                System.out.printf("The Random Number which you haven't guessed is  : %d\n\n", number);
            }
        }
        System.out.printf("Guessing the number Game is Over");
        System.out.printf("Total Score = %d\n", totalscore);
    }
}