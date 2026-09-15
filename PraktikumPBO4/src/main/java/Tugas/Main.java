package Tugas;


//fungsi untuk menjalankan
public class Main {
    public static void main(String[] args){
        Manusia pekerja = new Pekerja("Yoyok", 50, "Gali Kubur", 1000000);
        
        // Cetak hasil dari method toString()
        System.out.println(pekerja.toString());
    }
}