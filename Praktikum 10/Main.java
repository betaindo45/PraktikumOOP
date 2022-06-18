import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Titan t = new Titan();
            System.out.println("============= The Defenders =============");
            System.out.print("Masukkan nama player : ");
            String nama = in.nextLine();
            boolean a = true;
            int input = 0;

            while (a){
            menu();
            System.out.print("Input: ");
            try{
                input = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Tolong masukkan input yang valid");
                in.nextLine();
                continue;
            }
            if (input < 1 || input > 3){
                System.out.println("Tolong masukkan input yang benar");
            } else {
                System.out.print("Memulai game");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".\n");
                Thread.sleep(1000);
                a = false;
            }
        }

        switch (input) {
            case 1 -> {
                Magician m = new Magician(nama);
                Scene(t, m);
            }
            case 2 -> {
                Healer h = new Healer(nama);
                Scene(t, h);
            }
            case 3 -> {
                Warrior w = new Warrior(nama);
                Scene(t, w);
            }
            default -> System.out.println();
            }

    }
    public static void menu(){
            System.out.println("Pilih jenis karater yang diinginkan : ");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
    }

    public static void Scene(Titan t, Charater p) throws InterruptedException {
            boolean fightScene = true;
            System.out.println("========= Profil Pemain =========");
            p.info();
            System.out.println();
            t.info();
            System.out.println("=================================");
            int turn = 1;
            System.out.print("Memulai Pertatungan");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".\n");
            while (fightScene){
                if (t.getHp() > 0 && p.getHp() > 0){
                System.out.println("========= Turn " + turn + " =========");
                    if (p.getClass().getSimpleName().equalsIgnoreCase("Healer") && turn % 2 == 0){

                        p = healMethod((Healer) p);
                    }

                    if (p.attack()){
                        t.receiveDamage(p.getAttack());
                    }

                    if (t.attack()){
                        p.receiveDamage(t.getAttack());
                    }

                    p.info();
                    System.out.println();
                t.info();
                System.out.println();
                Thread.sleep(500);
                }else {
                    fightScene = false;
                }
                turn++;
                if (p.getHp() < 0){
                    p.setHp(0);
                }
                if (t.getHp() < 0){
                t.setHp(0);
                }
            }
        if (t.getHp() == 0){
            System.out.println("Player Win The Game!");
        }else if(p.getHp() == 0){
            System.out.println("The Titan Has Conquered The World");
        }
    }

    public static Charater healMethod(Healer h){
        h.heal();
        return h;
    }
}
