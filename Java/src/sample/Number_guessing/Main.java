package sample.Number_guessing;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberGuess,Turn = 0,RealNumber = (1+(int)(100 * Math.random()));


        System.out.println("Taking a number Between 1 to 127.....");
        System.out.println("Number is store......");



        do {
            System.out.print("Enter the number you guess ("+Turn+" out 6) done: ");
            numberGuess = scan.nextInt();

            if (numberGuess == RealNumber) {
                System.out.println("You Got the number "+RealNumber+"......");
                System.out.println("Congratulations");
                break;
            } else if (numberGuess + 10 >= RealNumber || numberGuess - 10 >= RealNumber)
                System.out.println("You are to close to.....");
            else System.out.println("Try Again");

            Turn++;
        }while(Turn<6);

        if(Turn==6){
            System.out.println("But Game Over....");
        }
    }
}
