
package Tugas;

public class Buku extends Produk {

    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon untuk Buku: 10%
        return harga * 0.10;
    }
}