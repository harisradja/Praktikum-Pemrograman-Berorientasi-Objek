package praktikum4;

public class Mobil extends Kendaraan {
    private int jumlahpintu;

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
    super (nama, kecepatanMaks, jenisMesin);
    this.jumlahpintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
    // Memanggil method dari induk jika ingin menampilkan info umum juga
    super.tampilkanInfoKendaraan ();
    System.out.println("Jumlah Pintu: " + jumlahpintu) ;
    }
}