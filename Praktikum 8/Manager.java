public class Manager extends Pekerja{
    private int lamaKerja;
    public static int countManager;
    Manager(String nama, String NIK, boolean jenisKelamin, boolean Menikah, String NIP, int    hariKerja, int jamKerja, int lamaKerja) {
        super(nama, NIK, jenisKelamin, Menikah,NIP, hariKerja, jamKerja);
        setLamaKerja(lamaKerja);
        countManager++;
        countPekerja--;
    }
    public int getLamaKerja() {
        return lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nLama Kerja\t\t: "+ getLamaKerja() + " Hari";
    }

    @Override
    public double getBonus(){
        return super.getBonus() + (super.getBonus() * 0.3);
    }
}
