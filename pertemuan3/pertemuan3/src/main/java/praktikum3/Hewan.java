
package praktikum3;
public class Hewan {
    // 1. Atribut diubah menjadi private (Enkapsulasi)
    private String nama;
    private int umur;

    // 2. Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // 3. Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // 4. Method tambahan
    void suara() {
        System.out.println("Hewan bersuara");
    }

    void berlari() {
        System.out.println("Hewan sedang berlari");
    }

    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }
}
