package oop.utvary;

import oop.Bod;

public class BarevnyCtverec extends Ctverec{
    
    private Barva barva;

    public BarevnyCtverec(Barva barva, Bod pocatek, int delka) {
        super(pocatek, delka);
        this.barva = barva;
    }

    public void vypis(){
        super.vypis();
        System.out.println("Barva = " + barva);
    }
    
    public Barva getBarva() {
        return barva;
    }    
    
    public static void main(String[] args) {
        BarevnyCtverec barevnyCtverec = 
                new BarevnyCtverec(Barva.CERVENA, new Bod(1,1), 1);     
        
        Ctverec ctverec = new Ctverec(new Bod(2,2), 2);
        barevnyCtverec.getBarva();
        
        
        
        barevnyCtverec.vypis();
    }
}

enum Barva {MODRA, ZELENA, CERVENA};
