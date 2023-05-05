package com.example.guessthenumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int [] arrayGuess = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while(right < 5){
            System.out.println("");
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please guess between 0-100.");
                continue;
            }

            if (selected == number){
                System.out.println("Congratulations.Your guess is correct! ");
                isWin = true;
                break;
            }

            else{
                System.out.println("Your guess is wrong.");
                if(selected < number){
                    System.out.println("Your guess is less than the number.");
                }
                else{
                    System.out.println("Your guess is greater than the number.");
                }
            }

            arrayGuess [right++] = selected;
            System.out.println("Remaining Right:" + (5-right));

        }
        System.out.println("");
        if (!isWin) {
            System.out.println("You're lost.");
            System.out.println("Your guess : " + Arrays.toString(arrayGuess));
            System.out.println("The number : " + number);
        }
    }
}
