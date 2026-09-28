package praktikum6;

public class Hewan {     
// Method
    public void bersuara() {
        System.out.println("Hewan Bersuara ");
    }
   
    public void makan(String makanan) {
        System.out.println("Hewan Makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan Makan " + jumlah + " porsi " + makanan);
    }
}
