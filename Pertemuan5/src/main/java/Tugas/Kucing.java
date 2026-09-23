package Tugas;

// Subclass Kucing
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Mamalia");
    }

    @Override
    public void suara() {
        System.out.println("Suara: Meow... Meow...");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
      