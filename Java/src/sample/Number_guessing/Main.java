package sample.Number_guessing;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberGuess,Turn = 0,RealNumber = (1+(int)(100 * Math.random()));


        System.out.println("Taking a number Between 1 to 127.....");
        System.out.println("Number is store......");

        System.out.println("Enter the number you guess: ");
        numberGuess = scan.nextInt();


        if(numberGuess == RealNumber){
            System.out.println("  ");
        }

    }
}
