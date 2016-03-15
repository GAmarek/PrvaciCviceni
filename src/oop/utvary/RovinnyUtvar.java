package oop.utvary;

import oop.Bod;

public abstract class RovinnyUtvar {
    
    public abstract double obsah();
    
    
    public static void main(String[] args) {
        RovinnyUtvar[] utvary = new RovinnyUtvar[2];
        
        utvary[0] = new Ctverec(new Bod(1,1), 2);
        utvary[1] = new Kruh(new Bod(2,2), 4);
        
        for(int i=0; i<utvary.length; i++){
            System.out.println("Utvar c." + i + "ma obsah " + utvary[i].obsah());
        }
    }
}
