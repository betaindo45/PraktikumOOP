public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;
    public static int countMahasiswa;
    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean Menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, Menikah);
        setNIM(NIM);
        setIPK(IPK);
        countMahasiswa++;
        countManusia--;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public double getIPK() {
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

@Override
    public String toString() {
        return super.toString(getBeasiswa()) +
            "\nNIM\t\t\t\t: " + getNIM() +
            "\nIPK\t\t\t\t: " + getIPK() +
            getStatus();
    }
    public String getStatus(){
        String angkatan =
        String.valueOf(NIM.charAt(0)) + NIM.charAt(1);
        int prodi = Integer.parseInt(String.valueOf(NIM.charAt(6)));
        String prodiFinal = switch (prodi) {
            case 2 -> "Teknik Meniup Gelembung";
            case 3 -> "Teknik Berburu Ubur- Ubur";
            case 4 -> "Sistem Perhamburgeran";
            case 6 -> "Pendidikan Chum Bucket";
            case 7 -> "Teknologi Telepon Kerang";
            default -> "";
            };
        return "\nAngkatan\t\t: 20" + angkatan +
                "\nProdi\t\t\t: " + prodiFinal;
        }
        public double getBeasiswa(){
            if(IPK >= 3.5 && IPK <=4){
                return 75;
        }else if(IPK >= 3.0 && IPK < 3.5){
            return 50;
        }else{
            return 0;
        }
    }
}
