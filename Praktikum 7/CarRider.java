public class CarRider {
    private String Nama;
    private int Umur;
    private String noHP;
    CarRider(String Nama, int Umur, String noHP) {
    this.Nama = Nama;
    this.Umur = Umur;
    this.noHP =noHP;
    }
    public String getNama() {
        return Nama;
    }
    public int getUmur() {
        return Umur;
    }
    public String getNoHP() {
        return noHP;
    }
}
