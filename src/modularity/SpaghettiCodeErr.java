package modularity;

/**
 * Odstrasujici priklad.
 * Priklad pouziti metod bez parametru. 
 * V tomto priklade je poruseno pravidlo zapouzdreni (encapsulace).
 * Takto vznika Spaghetti code.
 * Promenne pocetZnaku a vyskaTrojuhelniku by mely byt parametry metod.
 * Chyba, kterou program obsahuje se hleda obtizne
 */
public class SpaghettiCodeErr{
    
    static int pocetZnaku=1;
    static int vyskaTrojuhelniku=1;
    
    public static void main(String[] args) {
        while(vyskaTrojuhelniku <= 5){
            vypisTrojuhelnikZnaku();
        }        
    }
    
    public static void vypisRadekZnaku(){
        for(int i=1; i<=pocetZnaku; i++){
            System.out.print("*");
        }
        System.out.println();
        
        if(pocetZnaku >= vyskaTrojuhelniku){
            pocetZnaku = 1;
            if(vyskaTrojuhelniku >= 5){
                return;
            }
            vyskaTrojuhelniku++;
        } 
    }
    
    public static void vypisTrojuhelnikZnaku(){
        while(pocetZnaku <= vyskaTrojuhelniku){            
            vypisRadekZnaku();
            if(vyskaTrojuhelniku >= 5){
                return;
            }
        }            
    }
    
}
