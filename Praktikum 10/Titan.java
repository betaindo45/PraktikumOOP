public class Titan extends Charater{

    Titan(){
        setHp(200);
        setAttack(45);
        setDefense(0);
    }

    @Override
    public boolean attack(){
        int i = r.nextInt(100);
    return i < 40;
    }
}s
