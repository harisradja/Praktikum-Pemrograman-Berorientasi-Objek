package Tugas;
public class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method dasar yang akan di-override oleh kelas turunan
    public double hitungDiskon() {
        return 0; // Diskon bawaan 0%
    }

    // Method untuk mendapatkan harga setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}
