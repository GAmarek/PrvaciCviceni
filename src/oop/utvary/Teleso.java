package oop.utvary;

import oop.Bod;

public abstract class Teleso {
    
    protected RovinnyUtvar rovinnyUtvar;
    protected int vyska;
    
    public double objem(){
        return rovinnyUtvar.obsah() * vyska;
    }    
    
    public static void main(String[] args) {
        Teleso[] telesa = new Teleso[2];
        
        telesa[0] = new Kvadr(new Ctverec(new Bod(0,0), 1), 2);
        telesa[1] = new Valec(new Kruh(new Bod(1, 1), 5), 6);
        
        for(Teleso teleso : telesa){
            System.out.println("Objem telesa je: " + teleso.objem());
        }
    }
}
