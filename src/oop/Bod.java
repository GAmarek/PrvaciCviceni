package oop;

public class Bod {
    private int x;
    private int y;

    
    public Bod(int x, int y){
        if(x < 0){
            x = 0;
        }        
        if(y < 0){
            y = 0;
        }
        
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * Vrati svou vzdalenost od pocatku
     * @return 
     */
    public double vzdalenostOdPocatku() {
        Bod pocatek = new Bod(0, 0);
        
        return vzdalenostOdBodu(pocatek);
    }

    /**
     * Vrati vzdalenost bodu v parametru od sebe.
     * @param bod
     * @return 
     */
    public double vzdalenostOdBodu(Bod bod) {
        double vzdalenost = Math.sqrt(Math.pow(x - bod.x, 2) + Math.pow(y - bod.y, 2));
        return vzdalenost;
    }
    
    /**
     * Vypise svou reprezentaci.
     */
    public void vypis(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    /**
     * Zvetsi x-ovou souradnici bodu o 1.
     * @param bod 
     */
    public static void posunBodX1(Bod bod, int delka){
        if(bod.x + delka < 0){
            bod.x = 0;
            return;
        }
        
        bod.x = bod.x+delka;
    }
    
    
    public static void main(String[] args) {
        Bod bod1 = new Bod(1, 1);
        Bod bod2 = new Bod(2, 2);
        
        double vzdalenost = bod1.vzdalenostOdBodu(bod2);
        System.out.println("Vzdalenost bodu1 od bodu2 je: " + vzdalenost);
        System.out.println("Vzdalenost bodu1 od pocatku je: " + bod1.vzdalenostOdPocatku());
        
        bod1.vypis();        
        Bod.posunBodX1(bod1, 1);
        bod1.vypis();        
    }
}
