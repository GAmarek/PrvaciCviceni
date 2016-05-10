
public class Rekurze {
    
    public static void main(String[] args) {
        //System.out.println(faktorial(4));
        System.out.println(fibRek(6));
    }
    
    public static long faktorial(int n){
        if(n==1){
            return 1;
        }
        
        long vysledek = n * faktorial(n-1);
        return vysledek;                
    }
    
    public static long mocnina(int a, int b){
        long vysledek = 1;
        for(int i=0; i<b; i++){
            vysledek *= a;
        }        
        return vysledek;
    }
    
    public static long mocninaRek(int a, int b){
        if(b==0){
            return 1;
        }        
        return a*mocninaRek(a, b-1);
    }
    
    public static long fib(int n){
        if(n==1 || n==2){
            return n;
        }
        
        long a = 1;
        long b = 2;        
        for(int i=3; i<=n; i++){
            long c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    
    public static  long fibRek(int n){
        if(n==1 || n==2){
            return n;
        }
        return fibRek(n-1) + fibRek(n-2);
        
    }

}
