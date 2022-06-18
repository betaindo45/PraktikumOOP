public class Manusia {
    private String Nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean Menikah;
    public static int countManusia;

    private String isKelamin(){
        if(jenisKelamin){
            return "Laki-Laki";
        }else{
            return "Perempuan";
        }
    }
    Manusia(String nama, String NIK, boolean jenisKelamin, boolean Menikah){
        setNama(nama);
        setNIK(NIK);
        setJenisKelamin(jenisKelamin);
        setMenikah(Menikah);
        countManusia++;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        this.Nama = nama;
    }
    public String getNIK() {
        return NIK;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    public void setJenisKelamin(boolean
        jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
    }
    public boolean isMenikah() {
        return Menikah;
    }
    public void setMenikah(boolean menikah) {
        Menikah = menikah;
    }
    public double getTunjangan(){
        if (isMenikah()){
            if(jenisKelamin){
                return 25;
            }else{
                return 20;
            }
        }else{
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public double getPendapatan(double beasiswa){
        return getTunjangan() + beasiswa;
    }

    @Override
    public String toString() {
        return "Nama\t\t\t: " + getNama() +
                "\nNIK\t\t\t\t: " + getNIK() +
                "\nJenis Kelamin\t: " + isKelamin() +
                "\nPendapatan\t\t: " + "$" + getPendapatan();
                }
    public String toString(double tambah) {
        return "Nama\t\t\t: " + getNama() +
                "\nNIK\t\t\t\t: " + getNIK() +
                "\nJenis Kelamin\t: " + isKelamin() +
                "\nPendapatan\t\t: " + "$" + getPendapatan(tambah);
    }
}
