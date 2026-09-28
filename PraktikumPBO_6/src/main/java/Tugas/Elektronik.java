
package Tugas;
public class Elektronik extends Produk {

    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon untuk Elektronik: 15%
        return harga * 0.15;
    }
}