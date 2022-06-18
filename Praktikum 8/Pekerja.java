public class Pekerja extends Manusia{
    private double gaji;
    private double bonus = 0;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    public static int countPekerja;
        Pekerja(String nama, String NIK, boolean jenisKelamin, boolean Menikah, String NIP, int hariKerja, int jamKerja){
            super(nama, NIK, jenisKelamin, Menikah);
            setJamKerja(jamKerja);
            setHariKerja(hariKerja);
            setNIP(NIP);
            setBonus();
            setGaji();
            countPekerja++;
            countManusia--;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(){
        gaji = getJamKerja()*getHariKerja()*15;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus() {
        bonus += (hariKerja/7) *2*20*jamKerja;
        if (jamKerja > 7) {
            bonus += (jamKerja - 7) * 7;
        }
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public int getHariKerja() {
        return hariKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String toString(){
        return super.toString(getGaji() + getBonus()) +
                "\nGaji\t\t\t: $" + getGaji() +
                "\nBonus\t\t\t: $" + getBonus() +
                "\nNIP\t\t\t\t: " + getNIP() +
                getStatus();
    }
    public String getStatus(){
        int Cabang =
        Integer.parseInt(String.valueOf(NIP.charAt(0)));
        int nomorCabang = Integer.parseInt(String.valueOf(NIP.charAt(2)));
        int Departemen = Integer.parseInt(String.valueOf(NIP.charAt(6)));
        String cabangString = switch (Cabang){
            case 1 -> "Mondstadt";
            case 2 -> "Liyue";
            case 3 -> "Inazuma";
            case 4 -> "Sumeru";
            case 5 -> "Fontaine";
            case 6 -> "Natlan";
            case 7 -> "Snezhnaya";
            default -> "";
        };
        String departemenString = switch (Departemen){
            case 1 -> "Pemasaran";
            case 2 -> "Hubungan Masyarakat";
            case 3 -> "Riset";
            case 4 -> "Teknologi";
            case 5 -> "Personalia";
            case 6 -> "Akademik";
            case 7 -> "Administrasi";
            case 8 -> "Operasional";
            case 9 -> "Pembangunan";
            default -> "";
        };
        return "\nKantor Cabang " + cabangString + " Nomor " + nomorCabang +
                "\nDepartemen " + departemenString;
    }
}
