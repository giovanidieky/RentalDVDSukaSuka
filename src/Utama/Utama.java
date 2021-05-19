package Utama;

import Sewa.Pengembalian;
import Sewa.Penyewaan;
import Users.Petugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(isr);

        try {
            System.out.println("-------------------------");
            System.out.println(" Rental DVD Suka Suka ");
            System.out.println("-------------------------");
            System.out.println(" Denpasar Renon Bali");
            Petugas hallo = new Petugas("Susilo");
            hallo.HiPetugas();
            int pil;
            do {
                System.out.println("1. Peminjaman");
                System.out.println("2.Pengembalian");
                System.out.print("Pilihan Anda : ");
                pil = Integer.parseInt(Input.readLine());

                switch (pil) {
                    case 1:
                        System.out.println("PENYEWAAN ");
                        System.out.print("Nama Penyewa \t\t : ");
                        String nama = Input.readLine();
                        System.out.print("No Hp \t\t\t : ");
                        String nohp = Input.readLine();
                        System.out.print("Alamat \t\t\t : ");
                        String alamat = Input.readLine();
                        System.out.print("Kategori DVD \t\t: ");
                        String kategori = Input.readLine();
                        System.out.print("Judul DVD \t\t :");
                        String judul = Input.readLine();
                        System.out.print("Jaminan \t\t : ");
                        String jaminan = Input.readLine();

                        Penyewaan sewa = new Penyewaan();
                        sewa.PrintPenyewaan(nama,nohp,alamat,judul,jaminan,kategori);

                        break;

                    case 2:
                        System.out.println("PENGEMBALIAN ");
                        System.out.print("Nama Penyewa \t\t :");
                        String namap = Input.readLine();
                        System.out.print("No Hp \t\t\t : ");
                        String nohpp = Input.readLine();
                        System.out.print("Alamat \t\t\t : ");
                        String alamatp = Input.readLine();
                        System.out.print("Kategori DVD \t\t :");
                        String kategorip = Input.readLine();
                        System.out.print("Judul DVD \t\t : ");
                        String judulp = Input.readLine();
                        System.out.print("Jaminan \t\t : ");
                        String jaminanp = Input.readLine();
                        System.out.print("TanggalPeminjaman \t : ");

                        int tglpnjm =Integer.parseInt(Input.readLine());
                        System.out.print("Bulan dan Tahun \t :");

                        String bln = Input.readLine();
                        System.out.print("TanggalPengembalian \t : ");
                        int tglkmbl =Integer.parseInt(Input.readLine());
                        System.out.print("Bulan dan Tahun \t :");
                        String blnk = Input.readLine();

                        Pengembalian kembali = new Pengembalian();
                        kembali.PrintPengembalian(namap,nohpp,alamatp,judulp,jaminanp,kategorip,tglpnjm,tglkmbl,bln,blnk);

                        break;
                }
                System.out.println("0. Menu Utama");
                System.out.println("9. Tutup");
                System.out.print("Pilihlah angka [0/9] :");
                pil =Integer.parseInt(Input.readLine());

            }while (pil != 9);
        }
        catch(IOException e)
        {
            System.out.println("Error!!!"+ e.getMessage());
        }

    }
}
