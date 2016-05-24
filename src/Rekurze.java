
public class Rekurze {
        
    public static long faktorial(int n){
        if(n==1){
            return 1;
        }
        
        long vysledek = n * faktorial(n-1);
        return vysledek;                
    }
    
    public static long mocninaRek(int a, int b){
        if(b==0){
            return 1;
        }
        return a*mocninaRek(a, b-1);
    }
    
    public static long mocnina(int a, int b){
        long vysledek=1;
        for(int i=0; i<b; i++){
            vysledek *= a;
        }
        return vysledek;
    }
    
    public static long fib(int n){
        if(n==1 || n==2){
            return n;
        }
        
        long a=1;
        long b=2;        
        for(int i=3; i<=n; i++){
            long c=a+b;
            a=b;
            b=c;
        }        
        return b;
    }
    
    public static long fibRek(int n){
        if(n==1 || n==2){
            return n;
        }
        return fibRek(n-1) + fibRek(n-2);
    }
    
    public static void hanoi(int n, int od, int kam, int pres){
        if(n==0) return;
        
        hanoi(n-1, od, pres, kam);
        System.out.println(od + " -> " + kam);
        hanoi(n-1, pres, kam, od);
    }
        
    public static void main(String[] args) {
        //hanoi(3, 1, 2, 3);        
        char[] znaky = new char[]{'A', 'B', 'C', 'D'};
        char[] variace = new char[3];
        variace(0, znaky, variace);
    }
    
    public static void variace(int n, char[] znaky, char[] variace){
        if(n==variace.length){
            System.out.println(new String(variace));
            return;
        }
        
        for(char znak : znaky){
            variace[n] = znak;
            variace(n+1, znaky, variace);
        }
    }
    

    
    

}
