public class Magician extends Charater{

    Magician(String nama){
        setHp(100);
        setAttack(60);
        setDefense(10);
        setNama(nama);
    }

    @Override
    public boolean attack(){
        int i = r.nextInt(100);
        return i < 35;
    }

    @Override
    public void info(){
        System.out.println("Nama\t: " + getNama());
        super.info();
    }
}
