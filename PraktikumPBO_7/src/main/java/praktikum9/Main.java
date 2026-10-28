package praktikum9;

// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
    Kendaraan mobil = new Mobil();
    Kendaraan sepeda = new Sepeda();

    mobil.berjalan();
    mobil.info();
    
    sepeda.berjalan();
    sepeda.info();

    }
}
