public class Healer extends Charater {

    Healer(String nama){
        setHp(70);
        setAttack(10);
        setDefense(10);
        setNama(nama);
    }

    @Override
    public boolean attack() {
        int i = r.nextInt(100);
        return i < 85;
    }

    @Override
    public void info(){
        System.out.println("Nama\t: " + getNama());
        super.info();
    }

    void heal(){
        setHp(getHp()+25);
    }
}
