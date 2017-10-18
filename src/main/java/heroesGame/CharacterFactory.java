package heroesGame;

import heroesGame.Characters.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public class CharacterFactory {
    private Map<Integer, Callable<GameCharacter>> charConstructors;

    public CharacterFactory(){

        // Another alternative to switch is the HashTable of functions that should be executed
        charConstructors = new HashMap<>();

        charConstructors.put(0, () ->  new Hobbit());
        charConstructors.put(1, () -> new Elf());
        charConstructors.put(2, () -> new King());
        charConstructors.put(3, () -> new Knight());
    }

    public GameCharacter createRandomCharacter(){
        Random rand = new Random();

        int charType = rand.nextInt(charConstructors.size());
        GameCharacter character;
        try{
            character = charConstructors.get(charType).call();
        }catch (Exception e){
            character =  null;
        }

        return character;
    }
}
