package oop.utvary;

import oop.Bod;

public class BarevnyCtverec extends Ctverec{

    public BarevnyCtverec(Barva barva, Bod pocatek, int delka) {
        super(pocatek, delka);
        this.barva = barva;
    }
        
    private Barva barva;

    public Barva getBarva() {
        return barva;
    }
    
    @Override
    public void vypis(){
        super.vypis();
        System.out.println("Barva = " + barva);
    }
    
    public static void main(String[] args) {
        BarevnyCtverec barevnyCtverec = 
                new BarevnyCtverec(Barva.MODRA, new Bod(1,1), 5);
        
        Ctverec ctverec = new Ctverec(new Bod(2,2), 8);
                
                
        barevnyCtverec.vypis();
    }
}

enum Barva {MODRA, ZELENA, CERVENA};