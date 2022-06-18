package PBOLima;

public class Baju {
    private final int hargaA = 100_000;
    private final int hargaB = 125_000;
    private final int hargaC = 175_000;

    Baju(){
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100.000");
        System.out.println("Baju B dengan harga 125.000");
        System.out.println("Baju C   dengan harga 175.000");
    }

    public void hasil(String jenis, int jumlah){
        int hargaFinal = 0;
        switch (jenis){
            case "a":
               hargaFinal = hargaA(jumlah);
               break;
            case "b":
                hargaFinal = hargaB(jumlah);
                break;
            case "c":
                hargaFinal = hargaC(jumlah);
                break;
        }

        System.out.println("Jenis yang anda beli\t: " + jenis);
        System.out.println("Harga per buah\t\t\t: " + hargaFinal);
        System.out.println("Total harga\t\t\t\t: " + hargaFinal*jumlah);
    }

    int hargaA(int jumlah){
        if(jumlah > 100){
            return 95_000;
        }else{
            return hargaA;
        }
    }

    int hargaB(int jumlah){
        if(jumlah > 100){
            return 120_000;
        }else{
            return hargaB;
        }
    }

    int hargaC(int jumlah){
        if(jumlah > 100){
            return 160_000;
        }else{
            return hargaC;
        }
    }
}

