package oop.utvary;

public class Valec extends Teleso{    
    
    public Valec(Kruh kruh, int vyska){
        this.rovinnyUtvar = kruh;
        this.vyska = vyska;
    }

    @Override
    public int pocetRohu() {
        return 0;
    }
    
    
}
