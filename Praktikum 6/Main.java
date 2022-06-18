public class Main {
    public static void main(String[] args) {
        DataPedagang.pdg = DataPedagang.tambahPedagang(new Pedagang("Bakso Pak Sahid", "Bakso", 8000));
        DataPedagang.pdg = DataPedagang.tambahPedagang(new Pedagang("Nasgor Mbledes", "Nasi Goreng Jawa", 10000));
        DataPedagang.pdg = DataPedagang.tambahPedagang(new Pedagang("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataPedagang.viewData();

    }
}
