public class Main {
    public static void main(String[] args){
    Pegawai p1 = new PegawaiHarian("Budi","3175082107781002",9500,48);
    Pegawai p2 = new PegawaiTetap("Aji","3175678943567803",3500000);
    Pegawai p3 = new Sales("Murni","3175678456234590", 76, 100000);
    Pegawai p4 = new Sales("Galeazzo", "3175438909564738", 69,42000);
    Pegawai p5 = new PegawaiTetap("Tenskwatawa", "3175463789054786", 3750000);
    Pegawai p6 = new PegawaiTetap("Oliver","3175678940578437", 7500000);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);
    System.out.println(p6);
    System.out.println("Banyaknya pegawai\t\t: " + Pegawai.jumlahPegawai);
    System.out.println("Jumlah Pegawai Harian\t: " + PegawaiHarian.jumlahPegawaiHarian);
    System.out.println("Jumlah Pegawai Tetap\t: " + PegawaiTetap.jumlahPegawaiTetap);
    System.out.println("Jumlah Sales\t\t\t: " + Sales.jumlahSales);
    }
}
