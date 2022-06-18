public class Main {
public static void main(String[] args){
    Manusia man1 = new Manusia("Aurian", "2903898709475692", true, true);
    Manusia man2 = new Manusia("Zen Zen","2139041349865409",true,false);
    Manusia man3 = new Manusia("Cindy","578909796084759",false,true);
    MahasiswaFilkom mhs1 = new MahasiswaFilkom("Dhivara", "7685920824738673",true,false,"2151506012374",3. 6);
    MahasiswaFilkom mhs2 = new MahasiswaFilkom("Prima","5643235698458756",false ,false,"1951503020009001",3.4);
    MahasiswaFilkom mhs3 = new MahasiswaFilkom("Fandli","7589309475612859",true ,false,"19515070894289",2.9);
    Pekerja p1 = new Pekerja("Beta","2132435467590347", true, false,"144659878943",23,9);
    Pekerja p2 = new Pekerja("Taki", "9843247857360216", true, true,"351717969653",22,7);
    Pekerja p3 = new Pekerja("Ganyu","4671239857462390", false,true,"262847703495",25,12);
    Manager m1 = new Manager("Ani", "8745647310952758",false,false,"204837284392",20 ,9,1500);
    Manager m2 = new Manager("Qomar", "4379824375634543", true,false,"643943183475", 21,8,1100);
    Manager m3 = new Manager("Suisei", "754823490951268", false, true,"711875576284", 24, 10, 1750);
    System.out.println("========== Objek Manusia ==========");
    System.out.println(man1);
    System.out.println();
    System.out.println(man2);
    System.out.println();
    System.out.println(man3);
    System.out.println("===================================");
    System.out.println();
    System.out.println("========= Objek Mahasiswa =========");
    System.out.println(mhs1);
    System.out.println();
    System.out.println(mhs2);
    System.out.println();
    System.out.println(mhs3);
    System.out.println("===================================");
    System.out.println();
    System.out.println("========== Objek Pekerja ==========");
    System.out.println(p1);
    System.out.println();
    System.out.println(p2);
    System.out.println();
    System.out.println(p3);
    System.out.println("===================================");
    System.out.println();
    System.out.println("========== Objek Manager ==========");
    System.out.println(m1);
    System.out.println();
    System.out.println(m2);
    System.out.println();
    System.out.println(m3);
    System.out.println("===================================");
    System.out.println();
    System.out.println("Banyaknya objek manusia\t\t: " + Manusia.countManusia);
    System.out.println("Banyaknya objek mahasiswa\t: " + MahasiswaFilkom.countMahasiswa);
    System.out.println("Banyaknya objek pekerja\t\t: " + Pekerja.countPekerja);
    System.out.println("Banyaknya objek manager\t\t: " + Manager.countManager);
    }
}
