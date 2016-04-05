package oop.pisemka;

import java.util.Arrays;
import oop.Bod;
import oop.Infoservice;
import oop.utvary.Ctverec;

public class Test {


    
    public static void main(String[] args) {
/*
        Infoservice[] infoserviceList = new Infoservice[2];
        
        infoserviceList[0] = new Ctverec(new Bod(1,1), 5);
        infoserviceList[1] = new Nakladak(100, 1000, "AZ-15-78");
        
        for(Infoservice infoservice : infoserviceList){
            infoservice.info();
        }
        
        
        Auto auto = new Auto(true, 2000, "ABC-12-14");
        auto.cesta(10);
        auto.vypis();
  */      

        Vozidlo[] vozidla = new Vozidlo[2];
        vozidla[0] = new Auto(true, 1500, "BG-12-89");
        vozidla[1] = new Nakladak(4, 4000, "WQ-89-6");

        vozidla[0].cesta(10);
        vozidla[1].cesta(10);

        Arrays.sort(vozidla);
        
        for (Vozidlo vozidlo : vozidla) {
            vozidlo.vypis();
        }

        System.out.println("---------");
        System.out.println("Celkem najeto: " + Vozidlo.getNajetoCelkem());
    }
    
}
