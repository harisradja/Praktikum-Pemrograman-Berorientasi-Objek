package hierarki;

// Class Turunan (Level 3) - Mewarisi dari KendaraanDarat
public class SepedaMotor extends KendaraanDarat {
    private String jenisMesin;

    public SepedaMotor(String nama, int jumlahRoda, String jenisMesin) {
        super(nama, jumlahRoda); // Memanggil constructor dari KendaraanDarat
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}