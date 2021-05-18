package Sewa;

import Users.Customer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Penyewaan extends Transaksi {


    public void PrintPenyewaan(String nama, String nohp, String alamat, String judul, String jaminan, String kategori){
        System.out.println("-------------------------");
        System.out.println(" Rental DVD Suka Suka ");
        System.out.println("-------------------------");
        System.out.println(" Denpasar Renon Bali");

        Transaksi transaksi = new Transaksi();
        jenisTransaksi = "Peminjaman";
        transaksi.setJenisTransaksi(jenisTransaksi);
        transaksi.noTransaksi();
        System.out.println("Jenis Transaksi " + transaksi.getJenisTransaksi());

        Customer n = new Customer();
        n.setNama(nama);
        n.setNohp(nohp);
        n.setAlamat(alamat);
        n.setJudul(judul);
        n.setJaminan(jaminan);

        Kategori k = new Kategori();
        k.setKategori(kategori);
        System.out.println("Nama Penyewa \t\t: "+n.getNama());
        System.out.println("No.Hp \t\t\t :"+n.getNohp());
        System.out.println("Alamat \t\t\t :"+n.getAlamat());
        System.out.println("Judul DVD \t\t :"+n.getJudul());
        System.out.println("Jaminan \t\t :"+n.getJaminan());
        System.out.println("Kode DVD \t\t :"+k.getKategori());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar tgl = Calendar.getInstance();
        System.out.println("Tanggal Pinjam \t\t : "+tgl.getTime());
        tgl.add(Calendar.DATE, 4);
        System.out.println("BATASPENGEMBALIAN \t :"+sdf.format(tgl.getTime()));
        System.out.println("Denda telat /hari \t: Rp.3000");
        System.out.println("=============JANGAN TELAT YAAA =============");
    }
}
