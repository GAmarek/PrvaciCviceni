package oop.utvary;

import java.util.HashSet;
import java.util.Set;
import oop.Bod;

public abstract class Teleso implements Rohovatost{
    
    protected RovinnyUtvar rovinnyUtvar;
    protected int vyska;
    
    public double objem(){
        return rovinnyUtvar.obsah() * vyska;
    }    
    
    public static void main(String[] args) {
        Integer i1 = new Integer(4);
        Integer i2 = new Integer(4);
                
        Integer[] pole = {2,8,4,1,2,8,6};
        
        Set mnozina = new HashSet();
        
        for(Integer prvek : pole){
            if(!mnozina.add(prvek)){
                System.out.println("Duplicitni prvek: " + prvek);
            }
        }
        
        
        
        /*
        Rohovatost[] rohovateUtvary = new Rohovatost[3];
        
        rohovateUtvary[0] = new Kvadr(new Ctverec(new Bod(0,0), 1), 2);
        rohovateUtvary[1] = new Valec(new Kruh(new Bod(1, 1), 5), 6);
        rohovateUtvary[2] = new Ctverec(new Bod(2, 2), 5);
        
        for(Rohovatost utvar : rohovateUtvary){
            System.out.println(utvar.pocetRohu());
        }
                */
        
        
    }
    
    
}
