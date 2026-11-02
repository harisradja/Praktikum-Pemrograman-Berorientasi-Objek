
package tugaspertemuan9;


abstract class Hewan {
    abstract void bersuara();
    // Metode dengan implementasi
        void info() {
        System.out.println("hewan ini bersuara.");
    }
}
    
class Kucing extends Hewan {
    @Override
    void bersuara(){
        System.out.println("hewan ini bersuara meong");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara(){
        System.out.println("Hewan ini bersuara guk guk");
    }
}