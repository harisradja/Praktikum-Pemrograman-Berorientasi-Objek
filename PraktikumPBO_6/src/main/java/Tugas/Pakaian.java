
package Tugas;

public class Pakaian extends Produk {

    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon untuk Pakaian: 20%
        return harga * 0.20;
    }
}