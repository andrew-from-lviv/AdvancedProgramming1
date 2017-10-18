package heroesGame.Characters;

import static heroesGame.Utils.GameConstants.*;

public class Hobbit extends GameCharacter {
    public Hobbit(){
        super(HOBBIT_POWER, HOBBIT_HP);
    }

    @Override
    public void kick(GameCharacter c) {
        c.hp -= HOBBIT_POWER;
    }
}
