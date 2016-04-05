package oop.utvary;

import oop.Bod;

public class Kruh extends RovinnyUtvar{

    private Bod stred;
    private int polomer;

    public Kruh(Bod stred, int polomer) {
        this.stred = stred;
        this.polomer = polomer;
    }
    
    @Override
    public double obsah() {
        return Math.PI * polomer * polomer;
    }

    public Bod getStred() {
        return stred;
    }

    public int getPolomer() {
        return polomer;
    }

    @Override
    public int pocetRohu() {
        return 0;
    }
    
    
    
}
