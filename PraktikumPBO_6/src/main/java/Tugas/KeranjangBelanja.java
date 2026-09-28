package Tugas;

   import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    // Menambahkan produk ke keranjang
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    // Menghitung total harga sebelum dan sesudah diskon
    public double hitungTotalHargaSelesaiDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    // Menampilkan detail item di keranjang
    public void tampilkanKeranjang() {
        System.out.println("====== DETAIL KERANJANG BELANJA ======");
        for (Produk p : listProduk) {
            System.out.println("Produk       : " + p.getNama());
            System.out.println("Harga Awal   : Rp " + p.getHarga());
            System.out.println("Diskon       : Rp " + p.hitungDiskon());
            System.out.println("Harga Bayar  : Rp " + p.getHargaSetelahDiskon());
            System.out.println("--------------------------------------");
        }
        System.out.println("TOTAL HASIL BAYAR: Rp " + hitungTotalHargaSelesaiDiskon());
        System.out.println("======================================");
    }
}

