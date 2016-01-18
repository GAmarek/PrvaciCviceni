package modularity;

public class Trojuhelniky {
    
    public static void main(String[] args) {
        
        
        int pocetTrojuhelniku = 5;
        for(int vyskaTrojuhelniku = 1; vyskaTrojuhelniku <= pocetTrojuhelniku; vyskaTrojuhelniku++){
            vypisTrojuhelniku(vyskaTrojuhelniku, (char)((int)'0' + vyskaTrojuhelniku));
            vypisReverseTrojuhelniku(vyskaTrojuhelniku, (char)((int)'0' + vyskaTrojuhelniku));
        }
    }
    
    /**
     * Vypise na radek hvezdicky
     * @param pocetZnaku Pocet vypsanych hvezdicek
     * @param znak Vypisovany znak
     */
    public static void vypisRadekZnaku(int pocetZnaku, char znak){
        for(int i=1; i <= pocetZnaku; i++){
            System.out.print(znak);
        }
        System.out.println();
    }
    
    /**
     * Vypise trojuhelnik dane vysky pomoci danych znaku
     * @param vyska Vyska trojuhelniku
     * @param znak  Vypisovany znak
     */
    public static void vypisTrojuhelniku(int vyska, char znak){
        for(int radek=1; radek <= vyska; radek++){
            vypisRadekZnaku(radek, znak);
        }
    }
    
    public static void vypisReverseTrojuhelniku(int vyska, char znak){
        for(int radek=vyska; radek >= 1; radek--){
            vypisRadekZnaku(radek, znak);
        }
    }
    
        
}
