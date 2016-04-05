package oop.utvary;

import oop.Bod;

public class Kvadr extends Teleso{

    public Kvadr(Ctverec ctverec, int vyska) {
        this.rovinnyUtvar = ctverec;
        this.vyska = vyska;
    }
    
    public static void main(String[] args) {
        Kvadr kvadr = new Kvadr(new Ctverec(new Bod(1,1), 2), 4);
        System.out.println("Objem = " + kvadr.objem());
    }

    @Override
    public int pocetRohu() {
        return 8;
    }
    
    
}
