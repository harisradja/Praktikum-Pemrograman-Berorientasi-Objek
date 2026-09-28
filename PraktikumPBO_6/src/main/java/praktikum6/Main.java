package praktikum6;

public class Main {
    public static void main(String args[]) {
        // TODO code application logic here
        Hewan kucing = new Kucing();
        kucing.bersuara(); //output: hewan bersuara
        kucing.makan("ikan");
        kucing.makan("ikan", 2);
        
        Hewan anjing = new Anjing();
        anjing.bersuara(); //output hewan bersuara
        anjing.makan("tulang");
        anjing.makan("tulang", 3);   
    }
            
}
