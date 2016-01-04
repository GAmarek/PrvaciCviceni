package modularity;

public class Funkce {

    public static void main(String[] args) {
        for(int n=1; n <= 5; n++){
            long nFaktorial = faktorial(n);
            System.out.println(nFaktorial);            
        }
        
        int a = 7;
        long b = faktorial(a);
        System.out.println(b);            
        
        System.out.println("7+5=" + soucet(7,5));
        
    }
    
    /**
     * Funkce vraci faktorial parametru n.
     * @param n
     * @return 
     */
    public static long faktorial(int n){
        long vysledek = 1;
        for(int i=1; i <= n; i++){
            vysledek *= i;
        }
        
        return vysledek;
    }
    
    public static long soucet(int a, int b){
        return a + b;
    }
    
    
}
