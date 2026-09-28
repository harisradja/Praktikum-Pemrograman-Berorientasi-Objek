package Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Polimorfisme: Objek referensi Produk memegang instansiasi subclass
        Produk buku = new Buku("Buku Pemrograman Java", 120000);
        Produk laptop = new Elektronik("Laptop ASUS", 8500000);
        Produk kaos = new Pakaian("Kaos Polos", 75000);

        // Menambahkan barang ke keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        // Menampilkan detail belanja dan total harga
        keranjang.tampilkanKeranjang();
    }
}
