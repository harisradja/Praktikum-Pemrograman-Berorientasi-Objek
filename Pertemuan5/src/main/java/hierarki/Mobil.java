package hierarki;

// Class Turunan (Level 3) - Mewarisi dari KendaraanDarat
public class Mobil extends KendaraanDarat {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahRoda, int jumlahPintu) {
        super(nama, jumlahRoda); // Memanggil constructor dari KendaraanDarat
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}