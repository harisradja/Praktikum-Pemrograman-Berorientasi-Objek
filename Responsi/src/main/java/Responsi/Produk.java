package Responsi;
public class Produk {
   //attribut
    private String namaProduk;
    private double harga;
    
    //method
    public void tampilkanInfo(){
        System.out.println("Nama Produk: "+ namaProduk);
        System.out.println("Harga: "+ harga);
    }
    
    //construktor
    public Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // 3. Getter dan Setter
    public String getNama() {
        return namaProduk;
    }

    public void setNama(String namaProduk) {
        this.namaProduk= namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga= harga;
    }

}
    
    