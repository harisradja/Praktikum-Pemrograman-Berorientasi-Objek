package Tugas;
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mimi");
        Anjing anjing = new Anjing("Bobi");

        System.out.println("--- Data Kucing ---");
        kucing.tampilkanInfo();
        
        System.out.println("\n--- Data Anjing ---");
        anjing.tampilkanInfo();
    }
}


 