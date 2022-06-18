import java.io.*;
import java.util.*;

class Persegi{
    private double sisi;
    private double hasilLuas;

    Persegi(){
    }

    void setSisi(double sisi){
        this.sisi = sisi;
    }

    void printHasil(){
        hasilLuas = sisi*sisi;
        System.out.println((int)hasilLuas);
    }

}

class Segitiga{
    private double alas;
    private double tinggi;
    private double hasilLuas;

    Segitiga(){
    }

    void setAlas (double alas){this.alas = alas;}

    void setTinggi(double tinggi){this.tinggi = tinggi;}

    void printHasil(){
        hasilLuas = alas*tinggi/2;
        if(hasilLuas % 1 == 0){
            System.out.printf("%.0f", hasilLuas);
        }else{
            System.out.println((int)hasilLuas);
        }
    }

}

class Lingkaran{
    private double jariJari;

    Lingkaran(){
    }

    void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    void printHasil(){
        double luasLingkaran;
        if(jariJari % 7 == 0){
            double phiDua = 22/7;
            luasLingkaran = jariJari*jariJari* phiDua;
            System.out.print(luasLingkaran);
        }else{
            double phiSatu = 3.14;
            luasLingkaran = jariJari*jariJari* phiSatu;
            System.out.println((int) luasLingkaran);
        }
    }

}

public class Main {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = inp.nextInt();
        switch(pilihan){
            case 1:
                double sisi = inp.nextDouble();
                if(sisi != 0){
                    Persegi kotak = new Persegi();
                    kotak.setSisi(sisi);
                    kotak.printHasil();
                }
                break;
            case 2:
                double alas = inp.nextDouble();
                double tinggi = inp.nextDouble();

                Segitiga triangle = new Segitiga();
                triangle.setAlas(alas);
                triangle.setTinggi(tinggi);
                triangle.printHasil();

                break;
            case 3:
                double jariJari = inp.nextDouble();

                Lingkaran circle = new Lingkaran();
                circle.setJariJari(jariJari);
                circle.printHasil();

                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}

