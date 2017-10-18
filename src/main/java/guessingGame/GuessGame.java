package guessingGame;

import java.util.Random;

public class GuessGame {
    public double getBestScore() {
        return bestScore;
    }

    private double bestScore;

    public GuessGame(){
        bestScore = 0;
    }

    public void play(int max){
        Random rand = new Random();
        int numberToGuess = rand.nextInt(max);
        Integer userInput = Utils.askUserForIntegerInput("Please enter the number from 0 to " + max);

        int attempts = 1;

        while(userInput != numberToGuess){
            if(userInput > numberToGuess){
                userInput = Utils.askUserForIntegerInput("Oh! You were close but the number is actually smaller than what you've just tried (" + userInput + ")");
            }else {
                userInput = Utils.askUserForIntegerInput("The number is actually between than what you've just tried (" + userInput + ") and maximum" + max  );
            }

            if(userInput == null){
                return;
            }

            attempts++;
        }

        double score = (double)max / attempts;
        if(bestScore < score){
            bestScore = score;
        }
    }

    public void printBestScore(){
        System.out.println(bestScore);
    }


}
