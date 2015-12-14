
public class Cviceni1 {

    public static void main(String[] args) {
        int[] pole = {12527, 2680, 7892, 45890, 7594};

        //vypiste prvky pole delitelne 10
        System.out.println("vypiste prvky pole delitelne 10");
        int index = 0;
        while (index <= pole.length - 1) {
            if (pole[index] % 10 == 0) {
                System.out.println(pole[index]);
            }
            index++;
        }
        
        System.out.println("*******************************");
        
        //to same pomoci for cyklu
        for(int i=0; i <= pole.length - 1; i++){
            if (pole[i] % 10 == 0) {
                System.out.println(pole[i]);
            }
        }
        
        System.out.println("*******************************");
        
        //Vypiste maximalni prvek pole
        System.out.println("Vypiste maximalni prvek pole");
        
        int max = pole[0];
        for(int i=0; i <= pole.length - 1; i++){
            if(pole[i] > max){
                max = pole[i];
            }
        }
        System.out.println("max prvek je: " + max);
        
        System.out.println("*******************************");
        
        //Vypiste cetnost cisel 0..9 v poli loterie
        System.out.println("Vypiste cetnost cisel 0..9 v poli loterie");
        
        int[] loterie = {1,7,0,6,4,7,9,9,4,2,0,7,8};
        int[] cetnost = new int[10];
        
        for(int i=0; i <= loterie.length - 1; i++){
            cetnost[loterie[i]]++;
        }
        
        for(int i=0; i <= cetnost.length - 1; i++){
            System.out.println("Cetnost cisla "+  i  + " je " + cetnost[i]);
        }
        
        
        
        

    }
}
