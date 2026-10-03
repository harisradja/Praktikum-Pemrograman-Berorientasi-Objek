package ResponsiUTS_Radja_2505060076;

public class Elektronik extends Produk {
    //attribut  
    private int garansi;
     
    public Elektronik(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

  
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi: "+ garansi+ "tahun");
    }
}
