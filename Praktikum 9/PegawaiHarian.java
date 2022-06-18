public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
    public static int jumlahPegawaiHarian = 0;
    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
        jumlahPegawaiHarian++;
    }
    public double getUpahPerJam() {
        return upahPerJam;
    }
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    public int getTotalJam() {
        return totalJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji(){
        return getTotalJam()*getUpahPerJam();
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nKelompok\t\t: " + this.getClass().getSimpleName() +
                "\nUpah/Jam\t\t: " + getUpahPerJam() +
                "\nTotal Jam Kerja\t: " + getTotalJam() +
                "\nPendapatan\t\t: " + gaji() +
                "\n==================================\n";
    }
}
