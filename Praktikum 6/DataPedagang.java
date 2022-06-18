import java.util.Scanner;

public class DataPedagang {
    private static Scanner inp = new Scanner(System.in);
     static Pedagang[] pdg = new Pedagang[4];

    public static Pedagang[] tambahPedagang(Pedagang pedg){
        boolean cek = true;
        int i = 0;

        while (cek) {
            if(pdg[i] == null){
                pdg[i] = pedg;
                cek = false;
            }
            i++;
        }

        return pdg;
    }
    public static void viewData(){
        tambahPedagang(new Pedagang(inp.nextLine(),inp.nextLine(),inp.nextDouble()));
        for (Pedagang pdg: pdg) {
            System.out.println("==== Data Merchant UB Food ====");
            System.out.println("Nama\t: " + pdg.getNamaPedagang());
            System.out.println("Produk\t: " + pdg.getProduk());
            System.out.println("Harga\t: " +  pdg.getHarga());
        }
        System.out.println("By Muhammad Dhivara Aurian");
        System.out.println("215150607111001");
    }
    public static Pedagang cari(String nama) {
        Pedagang search = null;
        for (int i = 0; i < pdg.length;i++) {
            if (pdg[i].getNamaPedagang().equalsIgnoreCase(nama)) {
                System.out.println(pdg[i].getNamaPedagang());
                return pdg[i];
            }
        }
        return search;
    }

    public static void tampil(Pedagang pedg) {
        System.out.println("==== Data "+pedg.getNamaPedagang()+" ====");
        System.out.println("Nama Pedagang  : "+pedg.getNamaPedagang());
        System.out.println("Nama Produk    : "+pedg.getProduk());
        System.out.println("Harga          : "+(int)pedg.getHarga());
    }

    public static void update(Pedagang pedg) {
        System.out.println("=== Update Merchant ===");
        System.out.println("1. Nama Pedagang  : "+pedg.getNamaPedagang());
        System.out.println("2. Nama Produk    : "+pedg.getProduk());
        System.out.println("3. Harga          : "+(int)pedg.getHarga());
        System.out.print("Pilih yang ingin anda ubah (1 - 3) : "); int update = inp.nextInt();

        switch(update){
            case 1 :
                System.out.println("Nama Pedagang  : "+pedg.getNamaPedagang());
                System.out.print("Nama Pedagang Baru  : ");
                pedg.setNamaPedagang(inp.nextLine());
                break;

            case 2 :
                System.out.println("Nama Produk    : "+pedg.getProduk());
                System.out.print("Nama Produk Yang Baru  : ");
                pedg.setProduk(inp.nextLine());
                break;

            case 3 :
                System.out.println("Harga    : "+pedg.getHarga());
                System.out.print("New Price  : ");
                pedg.setHarga(inp.nextInt());
                break;

            default : System.out.println("Tolong berikan pilihan yang valid!");
        }

    }
}
