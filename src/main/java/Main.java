import guessingGame.GuessGame;
import guessingGame.Utils;
import heroesGame.CharacterFactory;
import heroesGame.Characters.GameCharacter;
import heroesGame.GameManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Task 2
//        GuessGame game = new GuessGame();
//        int dialogResult;
//
//        do{
//            Integer max = Utils.askUserForIntegerInput("Choose Max Value");
//            if(max != null){
//                game.play(max);
//                dialogResult = JOptionPane.showConfirmDialog(null, "Your best score is " + game.getBestScore() + ". Do you want to play again?");
//            }else {
//                break;
//            }
//
//
//        }while (dialogResult == JOptionPane.YES_OPTION);
//
//        game.printBestScore();

        //Task3
        GameManager manager = new GameManager();
        CharacterFactory factory = new CharacterFactory();

        GameCharacter c1 = factory.createRandomCharacter();
        GameCharacter c2 = factory.createRandomCharacter();

        manager.fight(c1,c2);
    }
}
