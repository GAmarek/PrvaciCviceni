package oop.pisemka;


public class Test {

    public static void main(String[] args) {       
        Auto auto = new Auto(true, 2000, "ABC-12-14");
        auto.cesta(10);
        auto.info();
        
        Vozidlo[] vozidla = new Vozidlo[2];
        vozidla[0] = new Auto(true, 1500, "BG-12-89");
        vozidla[1] = new Nakladak(4, 4000, "WQ-89-6");
        
        vozidla[0].cesta(10);
        vozidla[1].cesta(10);
        
        for(Vozidlo vozidlo : vozidla){
            vozidlo.info();
        }
        
        System.out.println("---------");
        System.out.println("Celkem najeto: " + Vozidlo.getNajetoCelkem());
    }

}
