package Users;

public class Petugas {
    String nama;
    String jabatan;

    public Petugas(String nama, String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public Petugas(String nama){
        this(nama,null);
    }

    public Petugas(){
        this(null);
    }

    public void HiPetugas(){
        System.out.println("Hallo!!! Kenalin aku "+this.nama);
        System.out.println("Siap menemanimu memilih DVD");
    }
}
