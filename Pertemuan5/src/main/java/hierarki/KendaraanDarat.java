package hierarki;

// Class Menengah (Level 2) - Mewarisi dari Kendaraan
public class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    public KendaraanDarat(String nama, int jumlahRoda) {
        super(nama); // Memanggil constructor dari class Kendaraan
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}

