package Sewa;

import java.util.Random;

public class Transaksi {
    Random rand = new Random();
    double noTransaksi= rand.nextDouble();
    String jenisTransaksi;

    Transaksi(){
    }

    public void noTransaksi(){
        System.out.println("Nomor Nota " + this.noTransaksi);
    }

    public void setJenisTransaksi(String jenisTransaksi){
        this.jenisTransaksi = jenisTransaksi;
    }

    String getJenisTransaksi(){
        return jenisTransaksi;
    }

}
