package Tugas;

//
public class Pekerja extends Manusia {
    private int gaji;
    
    //constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji; 
    }
    
    
    //fungsi untuk menampilkan
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: " + gaji;
    }
}
    

