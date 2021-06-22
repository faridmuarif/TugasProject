import java.text.SimpleDateFormat;

public class Murid {
    private String noinduk;
    private String namalengkap;
    private String jeniskelamin;
    private SimpleDateFormat tanggallahir;
    private String agama;
    private String alamat;
    private SimpleDateFormat tanggalditerima;
    private String notelepon;

    public Murid() {
    }

    public Murid(String noinduk, String namalengkap, String jeniskelamin) {
        this.noinduk = noinduk;
        this.namalengkap = namalengkap;
        this.jeniskelamin = jeniskelamin;
    }

    public Murid(String agama, String alamat) {
        this.agama = agama;
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

    public String getNoinduk() {
        return noinduk;
    }

    public void setNoinduk(String noinduk) {
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

    public SimpleDateFormat getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(SimpleDateFormat tanggallahir) {
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

    public SimpleDateFormat getTanggalditerima() {
        return tanggalditerima;
    }

    public void setTanggalditerima(SimpleDateFormat tanggalditerima) {
        this.tanggalditerima = tanggalditerima;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
    }
}
