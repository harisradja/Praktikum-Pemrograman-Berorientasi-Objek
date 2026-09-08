package praktikum3;

public class Main {
    public static void main(String[] args){
        Mobil honda = new Mobil("Honda", "Jazz", 2012, "Merah");
        Mobil toyota = new Mobil("Toyota", "Fortuner", 2015, "Hitam");
      
        honda.displayinfo();
        System.out.println("-------------------");
        toyota.displayinfo();
        
        System.out.println("-------------------");
        honda.startEngine();
        toyota.startEngine();
    }   
}