package ResponsiUTS_Radja_2505060076;
public class Main {
    public static void main(String[] args) {
        // --- 1. Output Produk ---
        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 1500000, 2);
        laptop.tampilkanInfo(); 
        System.out.println(); // Baris baru

        // --- 2. Output Pegawai ---
        System.out.println("2. Output Pegawai");
        Pegawai pegawai1 = new PegawaiTetap("Radja Harismansyah", 5000000, 1000000);
        pegawai1.tampilkanInfo();

        System.out.println(); // Baris baru

        // --- 3. Output Polimorfisme ---
        System.out.println("3. Output Polimorfisme");
        
        // Referensi kelas induk (Produk) memegang objek kelas turunan (Makanan)
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();

        // Referensi kelas induk (Pegawai) memegang objek kelas turunan (PegawaiKontrak)
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}
  