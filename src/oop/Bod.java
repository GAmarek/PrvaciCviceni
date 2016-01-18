package oop;

class Bod {
    int x;
    int y;

    /**
     * Vrati svou vzdalenost od pocatku
     * @return 
     */
    double vzdalenostOdPocatku() {
        Bod pocatek = new Bod();
        pocatek.x = 0;
        pocatek.y = 0;
        
        return vzdalenostOdBodu(pocatek);
    }

    /**
     * Vrati vzdalenost bodu v parametru od sebe.
     * @param bod
     * @return 
     */
    double vzdalenostOdBodu(Bod bod) {
        double vzdalenost = Math.sqrt(Math.pow(x - bod.x, 2) + Math.pow(y - bod.y, 2));
        return vzdalenost;
    }
    
    /**
     * Vypise svou reprezentaci.
     */
    void vypis(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();
    }

    /**
     * Zvetsi x-ovou souradnici bodu o 1.
     * @param bod 
     */
    static void posunBodX1(Bod bod){
        bod.x++;
    }
    
    public static void main(String[] args) {
        Bod bod1 = new Bod();
        bod1.x = 1;
        bod1.y = 1;

        Bod bod2 = new Bod();
        bod2.x = 2;
        bod2.y = 2;

        double vzdalenost = bod1.vzdalenostOdBodu(bod2);
        System.out.println("Vzdalenost bodu1 od bodu2 je: " + vzdalenost);
        System.out.println("Vzdalenost bodu1 od pocatku je: " + bod1.vzdalenostOdPocatku());
        
        bod1.vypis();        
        Bod.posunBodX1(bod1);
        bod1.vypis();        
    }
}
