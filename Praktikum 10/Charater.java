import java.util.Random;

public abstract class Charater {
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    Random r = new Random();
    private int defense, attack, hp;

    public abstract boolean attack();

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void receiveDamage(int attack){
        if (getHp() > attack - getDefense()){
            setHp(getHp()- attack- getDefense());
        } else if (getHp() < attack - getDefense()) {
            setHp(0);
        } else if (getHp() < 0) {
            setHp(0);
        }
    }

    void info(){
        System.out.println("Role\t: " + this.getClass().getSimpleName());
        System.out.println("HP\t\t: " + this.getHp());
        System.out.println("ATK\t\t: " + this.getAttack());
        System.out.println("DEF\t\t: " + this.getDefense());
    }
}
