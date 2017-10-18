package heroesGame;


import heroesGame.Characters.GameCharacter;

import java.util.Random;

public class GameManager {
//    private CharacterFactory factory;
//
//    public GameManager(){
//        factory = new CharacterFactory();
//    }

    public void fight(GameCharacter c1, GameCharacter c2){
        if(c1 == null || c2 == null){
            System.out.println("Find better fighters!! Those are NULL");
            return;
        }

        System.out.println("Let's the game begin");
        System.out.println("Alice is " + c1.getClass() + " HP: " + c1.getHp() + " Power: " + c1.getPower());
        System.out.println("Bob is " + c2.getClass() + " HP: " + c2.getHp() + " Power: " + c2.getPower());

        while(c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            System.out.println("Alice kicked Bob. Bob's new condition is" + c2.toString());

            if(c2.isAlive()){
                c2.kick(c1);
                System.out.println("Bob kicked Alice. Alice's new condition is" + c1.toString());
            }else {
                System.out.println("Bob is dead. Alice won!");
                return;
            }
        }

        System.out.println("Alice is dead. Bob won!");
    }
}
