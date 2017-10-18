package heroesGame.Characters;

import static heroesGame.Utils.GameConstants.*;

public class Elf extends GameCharacter {
    public Elf(){
        super(ELF_POWER, ELF_HP);
    }

    @Override
    public void kick(GameCharacter c) {
        if(c.power < this.power){
            c.hp = 0;
        }else{
            c.power--;
        }
    }
}
