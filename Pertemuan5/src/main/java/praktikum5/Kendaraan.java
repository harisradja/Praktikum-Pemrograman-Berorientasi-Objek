package praktikum5;
public class Kendaraan {
    String nama;
    int kecepatan;
        
    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");  
    }
}
// Class anak Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
        
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
// Class anak SepedaMotor
class SepedaMotor extends Kendaraan {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}