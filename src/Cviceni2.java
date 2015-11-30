

import java.util.Scanner;

public class Cviceni2 {

    public static void main(String[] args) {
        
        //Setrideni pole
        int[] pole = {5, 2, 8, 6, 90};

        for (int zacatek = 0; zacatek < pole.length; zacatek++) {
            int maxIndex = zacatek;
            for (int index = zacatek; index < pole.length; index++) {
                if (pole[index] > pole[maxIndex]) {
                    maxIndex = index;
                }
            }

            int temp = pole[zacatek];
            pole[zacatek] = pole[maxIndex];
            pole[maxIndex] = temp;
        }

        for (int index = 0; index < pole.length; index++) {
            System.out.println(pole[index]);
        }

        //Median hodnot pole (predpokladame, ze pole ma lichy pocet prvku)
        System.out.println("Median hodnot pole je: " + (pole[pole.length / 2]));

        //Aritmeticky prumer hodnot pole
        int soucet = 0;
        for (int index = 0; index < pole.length; index++) {
            soucet += pole[index];
        }
        System.out.println("Aritmeticky prumer hodnot pole je: " + (double) soucet / pole.length);

        
        //Nacteni dvojrozmernneho pole
        Scanner scanner = new Scanner(System.in);

        double[][] zavod = new double[5][3];

        for (int zavodnik = 0; zavodnik < zavod.length; zavodnik++) {
            for (int pokus = 0; pokus < zavod[zavodnik].length; pokus++) {
                System.out.println("Zavodnik cislo: " + (zavodnik + 1) + " Pokus cislo: " + (pokus + 1));
                zavod[zavodnik][pokus] = scanner.nextDouble();
            }
        }

        //Vypis dvojrozmerneho pole
        for (int zavodnik = 0; zavodnik < zavod.length; zavodnik++) {
            System.out.print("Zavodnik cislo: " + (zavodnik + 1) + ": ");
            for (int pokus = 0; pokus < zavod[zavodnik].length; pokus++) {
                System.out.print(zavod[zavodnik][pokus] + ", ");
            }
            System.out.println();
        }

        
        //Nacteni trojuhelnikova matice        
        double vyrazovaciZavod[][] = new double[5][];

        for (int kolo = 0; kolo < vyrazovaciZavod.length; kolo++) {
            vyrazovaciZavod[kolo] = new double[vyrazovaciZavod.length - kolo];
            System.out.println("Kolo cislo: " + (kolo+1));
            for (int index = 0; index < vyrazovaciZavod[kolo].length; index++) {
                System.out.println("Pokus cislo: " + (index+1));
                vyrazovaciZavod[kolo][index] = scanner.nextDouble();
            }
        }
        
        //Vypis trojuhelnikove matice
        for(int kolo = 0; kolo < vyrazovaciZavod.length; kolo++){
            System.out.println("Kolo cislo: " + (kolo+1));            
            for(int index = 0; index < vyrazovaciZavod[kolo].length; index++){
                System.out.print(vyrazovaciZavod[kolo][index] + ", ");
            }
            System.out.println();
        }
        
        //Zkracena inicializace dvojrozmerneho pole
        int pole2[][] = {
            {7,4,9,0},
            {6,9,0},
            {8,0},            
            {2}
        };
        
        for(int kolo = 0; kolo < pole2.length; kolo++){
            System.out.println("Kolo cislo: " + (kolo+1));            
            for(int index = 0; index < pole2[kolo].length; index++){
                System.out.print(pole2[kolo][index] + ", ");
            }
            System.out.println();
        }
        
        
        
        
    }
}
