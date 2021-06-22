import java.util.Date;

public class MuridPindahan extends Murid{
    private int nisn;
    private String asalsekolah;
    private Date tanggalpindah;

    public void kekelas(){
        System.out.println("Murid pindahan ke kelas");
    }

    public void menguruspindahankesekolah(){
        System.out.println("Murid mengurus pindah ke sekolah");
    }

    public int getNisn() {
        return nisn;
    }

    public void setNisn(int nisn) {
        this.nisn = nisn;
    }

    public String getAsalsekolah() {
        return asalsekolah;
    }

    public void setAsalsekolah(String asalsekolah) {
        this.asalsekolah = asalsekolah;
    }

    public Date getTanggalpindah() {
        return tanggalpindah;
    }

    public void setTanggalpindah(Date tanggalpindah) {
        this.tanggalpindah = tanggalpindah;
    }

    @Override
    public void belajar() {
        System.out.println("Belajar Matematika");
    }

    @Override
    public void naikkekelas() {
        System.out.println("Naik ke kelas = 6");
    }
}
