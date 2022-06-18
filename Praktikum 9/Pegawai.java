public abstract class Pegawai {
    private final String nama;
    private final String noKTP;
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }
    public static int jumlahPegawai = 0;
    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
        jumlahPegawai++;
    }
    public String toString(){
        return "========== Data Pegawai ==========" +
                "\nNama\t\t\t: " + getNama() +
                "\nNo. KTP\t\t\t: " + getNoKTP();
    }
    public double gaji(){
        return 0;
    }
}
