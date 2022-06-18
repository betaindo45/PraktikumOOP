public class Pedagang {
    private String namaPedagang, Produk;

    public String getNamaPedagang() {
        return namaPedagang;
    }

    public void setNamaPedagang(String namaPedagang) {
        this.namaPedagang = namaPedagang;
    }

    public String getProduk() {
        return Produk;
    }

    public void setProduk(String produk) {
        Produk = produk;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double harga) {
        Harga = harga;
    }

    private double Harga;

    Pedagang(String namaPedagang, String Produk, double Harga){
        this.namaPedagang = namaPedagang;
        this.Produk = Produk;
        this.Harga = Harga;
    }
}
