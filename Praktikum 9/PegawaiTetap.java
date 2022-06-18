public class PegawaiTetap extends Pegawai{
    private double upah;
    public static int jumlahPegawaiTetap = 0;
    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
        jumlahPegawaiTetap++;
    }

    @Override
    public double gaji() {
        return getUpah();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKelompok\t\t: " + this.getClass().getSimpleName() +
                "\nUpah\t\t\t: " + getUpah() +
                "\nPendapatan\t\t: " + gaji() +
                "\n==================================\n";
    }
}
