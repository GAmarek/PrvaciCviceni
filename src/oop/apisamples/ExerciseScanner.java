package oop.apisamples;

import java.io.File;
import java.util.Scanner;

public class ExerciseScanner {

    public static void nactiVstup(Scanner scanner, ArrayList list) {
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
    }

    public static void seradList(ArrayList list) {
        list.sort();
    }

    public static void vypisList(ArrayList list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }

    public static void zpracujVstup(Scanner scanner) {
        ArrayList list = new ArrayList();

        nactiVstup(scanner, list);
        System.out.println();
        seradList(list);
        vypisList(list);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner;        
        
        int[] pole = {2, 8, 1, 8};
        ArrayList list = new ArrayList(pole);
        pole[0] = -1;
        
        
        if (args.length == 0) {
            System.out.println("Pouzijte argument pro typ vstupu. Podporovane hodnoty: console|soubor|retezec");
            return;
        }

        switch (args[0]) {
            case "console":
                scanner = new Scanner(System.in);
                zpracujVstup(scanner);
                break;
            case "soubor":
                File file = new File("test.txt");
                scanner = new Scanner(file);
                zpracujVstup(scanner);
                break;
            case "retezec":
                String testString = "8 4 2 1 0";
                scanner = new Scanner(testString);
                zpracujVstup(scanner);
                break;
            default:
                System.out.println("Tento typ vstupu neni podporovan");
        }
        
    }
}
