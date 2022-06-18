public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    public static int jumlahSales = 0;
    Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
        jumlahSales++;
    }
    public int getPenjualan() {
        return penjualan;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return getKomisi()*getPenjualan();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKelompok\t\t: " + this.getClass().getSimpleName() +
                "\nPenjualan\t\t: " + getPenjualan()+
                "\nBesar Komisi\t: " + getKomisi() +
                "\nPendapatan\t\t: " + gaji() +
                "\n==================================\n";
    }
}
