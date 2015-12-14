
public class Veze {

    static boolean[][] hriste = new boolean[8][8];

    public static void main(String[] args) {
        String postaveniVezi = "A1,B2,C4,H5";

        // vytorime pole vezi
        int[][] veze = vytvorPoleVezi(postaveniVezi);
        
        boolean vezeOK = true;
        for (int index = 0; index < veze.length; index++) {
            if (!kontrolaVeze(veze[index])) {
                vezeOK = false;
                break;
            }
        }

        if (vezeOK) {
            System.out.println("Veze se navzajem neohrozuji.");
        } else {
            System.out.println("Veze se navzajem ohrozuji");
        }

    }

    /**
     * Vytvori pole vezi dane jejich souradnicemi na hraci plose
     * 
     * @param postaveniVezi Retezec rozestaveni vezi. Jednotlive veze jsou oddeleny carkou. Pr: A4,B8,C1,C5
     * @return 
     */
    public static int[][] vytvorPoleVezi(String postaveniVezi) {
        String[] vezeStringPole = postaveniVezi.split(",");

        int[][] veze = new int[vezeStringPole.length][2];

        for (int index = 0; index < veze.length; index++) {
            String vezString = vezeStringPole[index];

            int radek = Character.getNumericValue(vezString.charAt(1)) - 1;
            int sloupec = (int) vezString.charAt(0) - (int) 'A';

            veze[index][0] = radek;
            veze[index][1] = sloupec;
        }

        return veze;
    }

    /**
     * Kontrola, zda vez nestoji na jiz ohrozenem policku. Oznaceni nove ohrozenych policek. 
     * 
     * @param vez
     * @return 
     */
    public static boolean kontrolaVeze(int[] vez) {
        if(hriste[vez[0]][vez[1]]){
            return false;
        }
        
        int radek = vez[0];
        for (int sloupecR = 0; sloupecR < 8; sloupecR++) {
            hriste[radek][sloupecR] = true;
        }
        
        int sloupec = vez[1];
        for (int radekS = 0; radekS < 8; radekS++) {
            hriste[radekS][sloupec] = true;
        }

        return true;
    }
}
