package heroesGame.Characters;

import static heroesGame.Utils.GameConstants.*;
import java.util.concurrent.ThreadLocalRandom;

public class Knight extends GameCharacter {

    public Knight(){
        super(ThreadLocalRandom.current().nextInt(KNIGHT_MIN_POWER,KNIGHT_MAX_POWER + 1),ThreadLocalRandom.current().nextInt(KNIGHT_MIN_HP,KNIGHT_MAX_HP));
    }

    @Override
    public void kick(GameCharacter c) {
        c.hp -= this.power;
    }
}
