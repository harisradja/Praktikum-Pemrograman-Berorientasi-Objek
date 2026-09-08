package praktikum3;
public class Mobil{
    // 1. Atribut diubah menjadi private (Enkapsulasi)
    private String merk;
    private String model;
    private int tahun;
    private String warna;
 
    //2. Constructor
    public Mobil(String merk, String model, int tahun, String warna){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;  
    }
    
  //3. getter dan setter
    public String getmerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getmodel(){
        return merk;
    }
    
    public void setmodel(String model){
        this.model = model;
    }
    
    public int gettahun(){
        return tahun;
    }
    
    public void settahun(int tahun){
        this.tahun = tahun;
    }
    
    public String getwarna(){
        return warna;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
    //method untuk menampilkan info data
    public void displayinfo(){
        System.out.println("Merek: "+ merk);
        System.out.println("Modul: "+ model);
        System.out.println("Tahun: "+ tahun);
        System.out.println("Warna: "+ warna);
    }
    
    //method untuk mesin
    void startEngine(){
        System.out.println("Mesin Mobil Merk "+ merk+ " menyala");
    }
    
    
}