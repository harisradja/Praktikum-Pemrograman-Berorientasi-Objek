package hierarki;


public class Main {
    public static void main(String[] args) {
        // Objek Mobil (Menerima parameter nama, jumlahRoda, jumlahPintu)
        Mobil mobil = new Mobil("Honda Civic", 4, 4);

        // Objek SepedaMotor (Menerima parameter nama, jumlahRoda, jenisMesin)
        SepedaMotor motor = new SepedaMotor("Honda CBR", 2, "4-tak");

        System.out.println("=========================================");
        System.out.println("    DEMO HIERARKI PEWARISAN 3 LEVEL     ");
        System.out.println("=========================================");
        
        System.out.println("\n--- Informasi Mobil ---");
        mobil.tampilkanInfo();

        System.out.println("\n--- Informasi Sepeda Motor ---");
        motor.tampilkanInfo();
    }
}
