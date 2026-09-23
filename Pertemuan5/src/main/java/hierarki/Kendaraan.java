package hierarki;

// Class Induk Paling Atas (Level 1)
public class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
    }
}