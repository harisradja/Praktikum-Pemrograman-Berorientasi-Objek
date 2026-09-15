package praktikum4;
public class Kendaraan {
    // Attribut dengan akses modifier berbeda
    private String nama;
    protected int kecepatanMaks;
    private String jenisMesin;

    // Constructor / inisialisasi data awal
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks ;
        this.jenisMesin = jenisMesin;
    }
    // Getter dan setter untuk nama
    public String getNama() {
        return nama; 
    } 
    public void setNama(String nama) {
        this.nama = nama;
    }
    //method untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: "+ nama);
        System.out.println("Kecepatan Maksimum: "+ kecepatanMaks + "km/h");
        System.out.println("Jenis Mesin: "+ jenisMesin);
    }
}