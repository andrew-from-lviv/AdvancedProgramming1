package heroesGame.Characters;

public abstract class GameCharacter {
    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    int power;
    int hp;

    public GameCharacter(){}
    public GameCharacter(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(GameCharacter c);

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return "Power: " + this.power + " HP: " + this.hp;
    }

    //    public void reducePower(int damage){
//        this.power -= damage;
//    }
//
//    public void reduceHP(int damage){
//        this.hp -= damage;
//    }
}
