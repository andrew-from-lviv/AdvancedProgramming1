package heroesGame.Characters;

import java.util.concurrent.ThreadLocalRandom;
import static heroesGame.Utils.GameConstants.*;

public class King extends GameCharacter {

    public King(){
        super(ThreadLocalRandom.current().nextInt(KING_MIN_POWER,KING_MAX_POWER + 1), ThreadLocalRandom.current().nextInt(KING_MIN_HP, KING_MAX_HP + 1));
    }

    @Override
    public void kick(GameCharacter c) {
        c.hp -= this.power;
    }
}
