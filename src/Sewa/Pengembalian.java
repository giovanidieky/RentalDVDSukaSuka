package Sewa;

import Users.Customer;

public class Pengembalian extends Transaksi {

    public void PrintPengembalian(String namap, String nohpp, String alamatp, String judulp, String jaminanp,String kategorip, int tglpnjm, int tglkmbl,String bln, String blnk){
        System.out.println("-------------------------");
        System.out.println(" Rental DVD Suka Suka ");
        System.out.println("-------------------------");
        System.out.println(" Denpasar Renon Bali");

        Transaksi transaksi = new Transaksi();
        jenisTransaksi = "Pengembalian";
        transaksi.setJenisTransaksi(jenisTransaksi);
        System.out.println("Jenis Transaksi " + transaksi.getJenisTransaksi());

        System.out.println("KWITANSI ");
        Customer m = new Customer();
        m.setNama(namap);
        m.setNohp(nohpp);
        m.setAlamat(alamatp);
        m.setJudul(judulp);
        m.setJaminan(jaminanp);
        Kategori t = new Kategori();
        t.setKategori(kategorip);
        System.out.println("Nama Penyewa \t\t: "+m.getNama());
        System.out.println("No.Hp \t\t\t :"+m.getNohp());
        System.out.println("Alamat \t\t\t :"+m.getAlamat());
        System.out.println("Judul DVD \t\t :"+m.getJudul());
        System.out.println("Jaminan \t\t :"+m.getJaminan());
        System.out.println("Kode DVD \t\t :"+m.getKategori());
        System.out.println("TanggalPeminjaman \t : "+tglpnjm+ " " +bln);
        System.out.println("TanggalPengembalian \t : "+tglkmbl+ " " +blnk);
        int batas = 4;
        int bataskmbl = tglpnjm + batas;
        System.out.println("BATASPENGEMBALIAN \t : Tanggal "+bataskmbl+ " "+bln);
        int telat = tglkmbl - bataskmbl;
        int denda = telat * 3000;
        System.out.println("Denda telat /hari \t: " +telat+ " x Rp.3000 = "+denda );

    }
}
