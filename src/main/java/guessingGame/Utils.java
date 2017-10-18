package guessingGame;

import javax.swing.*;

public class Utils {
    public static Integer askUserForIntegerInput(String message){
        Integer number = null;

        do{

            String userInput = JOptionPane.showInputDialog(message);
            if(userInput == null){
                break;
            }

            number = convertUserInputToInt(userInput);

        }while(number == null);

        return number;
    }

    private static Integer convertUserInputToInt(String value){
        try{
            Integer result = Integer.parseInt(value);
            return result;
        }catch (Exception e){
            return null;
        }
    }
}
