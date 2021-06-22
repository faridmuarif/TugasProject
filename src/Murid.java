import java.util.Date;

public class Murid {
    private int noinduk;
    private String namalengkap;
    private String jeniskelamin;
    private Date tanggallahir;
    private String agama;
    private String alamat;
    private Date tanggalditerima;
    private int notelepon;

    public Murid() {
    }

    public Murid(int noinduk, String namalengkap, String jeniskelamin, Date tanggallahir, String agama, String alamat, Date tanggalditerima, int notelepon) {
        this.noinduk = noinduk;
        this.namalengkap = namalengkap;
        this.jeniskelamin = jeniskelamin;
        this.tanggallahir = tanggallahir;
        this.agama = agama;
        this.alamat = alamat;
        this.tanggalditerima = tanggalditerima;
        this.notelepon = notelepon;
    }


    public Murid(String namalengkap, String jeniskelamin, String alamat) {
        this.namalengkap = namalengkap;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
    }

    public void belajar(){
        System.out.println("Murid belajar");
    }

    public void mengerjakanlatihan(){
        System.out.println("Murid mengerjakan latihan");
    }

    public void jajan(){
        System.out.println("Murid jajan");
    }

    public void naikkekelas(){
        System.out.println("Murid naik ke kelas");
    }

    public int getNoinduk() {
        return noinduk;
    }

    public void setNoinduk(int noinduk) {
        this.noinduk = noinduk;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalditerima() {
        return tanggalditerima;
    }

    public void setTanggalditerima(Date tanggalditerima) {
        this.tanggalditerima = tanggalditerima;
    }

    public int getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(int notelepon) {
        this.notelepon = notelepon;
    }
}
