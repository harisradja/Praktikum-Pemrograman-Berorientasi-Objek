package ResponsiUTS_Radja_2505060076;

public class Pegawai {
    //attribut
    private String namaPegawai;
    private double gaji;
   
    //consrtucktor
    public Pegawai(String namaPegawai, double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //Getter dan Setter nama
    public String getNama() {
        return namaPegawai;
    }

    public void setNama(String namaPegawai) {
        this.namaPegawai= namaPegawai;
    } 
    
    
    //Getter dan Setter nama
    public String getGaji() {
        return namaPegawai;
    }

    public void setGaji(double gaji) {
        this.gaji= gaji;
    }
    

    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}
    
