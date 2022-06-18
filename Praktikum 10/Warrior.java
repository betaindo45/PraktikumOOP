public class Warrior extends Charater{

    Warrior(String nama){
        setHp(80);
        setAttack(25);
        setDefense(30);
        setNama(nama);
    }

    @Override
    public boolean attack() {
        int i = r.nextInt(100);
        return i < 60;
    }

    @Override
    public void info(){
        System.out.println("Nama\t: " + getNama());
        super.info();
    }
}
