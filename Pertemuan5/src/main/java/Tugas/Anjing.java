package Tugas;

// Subclass Anjing
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Mamalia");
    }

    @Override
    public void suara() {
        System.out.println("Suara: Guk... Guk...");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
