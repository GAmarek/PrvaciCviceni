package oop.utvary;

import oop.Bod;

class Ctverec {
    private Bod pocatek;
    private int delka;
    
    public Ctverec(Bod pocatek, int delka){
        this.pocatek = pocatek;
        
        if(delka < 0){
            delka = 0;
        }
        this.delka = delka;
    }
    
    public long obvod(){
        return 4*delka;
    }
    
    public long obsah(){
        return delka*delka;
    }
    
    public static void posunX(Ctverec ctverec, int delka){
        Bod.posunBodX1(ctverec.pocatek, delka);
    }
    
    public void posunX(int delka){
        Bod.posunBodX1(pocatek, delka);
    }
        
    
    public void vypis(){        
        System.out.println("Vypis ctverce:");
        System.out.println("Pocatek ctverce je v bode:");
        pocatek.vypis();
        System.out.println("Delka ctverce je " + delka);        
    }

    public static void main(String[] args) {
        Bod pocatekCtverce = new Bod(1, 2);
        
        Ctverec ctverec = new Ctverec(pocatekCtverce, 2);
        
        ctverec.vypis();
        System.out.println("Obvod ctverce je " + ctverec.obvod());
        
        ctverec.posunX(1);
        ctverec.vypis();
        
    }    
    
}
