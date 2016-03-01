package oop.utvary;

public abstract class Teleso {
    
    protected RovinnyUtvar rovinnyUtvar;
    protected int vyska;
    
    public double objem(){
        return rovinnyUtvar.obsah() * vyska;
    }    
    
}
