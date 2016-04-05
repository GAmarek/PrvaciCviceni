package oop.pisemka;

import oop.Infoservice;


public class Nakladak extends Vozidlo implements Infoservice{
    private int objemNavesu;

    public Nakladak(int objemNavesu, double obsahMotoru, String spz) {
        super(obsahMotoru, spz);
        this.objemNavesu = objemNavesu;
    }
    
    @Override
    public double spotreba() {
        return getObsahMotoru() * objemNavesu / 1000;        
    }

    @Override
    public void vypis() {
        System.out.println("Nakladak: ");
        super.vypis();
        System.out.println("objemNavesu = " + objemNavesu);
    }

    public int getObjemNavesu() {
        return objemNavesu;
    }

    @Override
    public void info() {
        vypis();
    }
    
    
}
