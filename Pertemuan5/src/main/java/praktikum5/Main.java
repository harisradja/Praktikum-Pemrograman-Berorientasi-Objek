package praktikum5;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        
        System.out.println("--- Informasi Mobil ---");
        mobil.tampilkanInfo();

        System.out.println();
        // Membuat objek SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha F1ZR";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";

        System.out.println("--- Informasi Sepeda Motor ---");
        motor.tampilkanInfo();
    }
}

