package Users;

public class Customer {
    private String nama;
    private String noHp;
    private String alamat;
    private String kategori;
    private String judul;
    private String jaminan;

    public void setNama(String newNama){
        this.nama = newNama;
    }
    public void setNohp(String newNoHp){
        this.noHp = newNoHp;
    }
    public void setAlamat(String newAlamat){
        this.alamat = newAlamat;
    }
    public void setJudul(String newJudul){
        this.judul = newJudul;
    }
    public void setJaminan(String newJaminan){
        this.jaminan = newJaminan;
    }

    public String getNama(){
        return nama;
    }
    public String getNohp(){
        return noHp;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJudul(){
        return judul;
    }
    public String getKategori(){ return kategori; }
    public String getJaminan(){
        return jaminan;
    }
}
