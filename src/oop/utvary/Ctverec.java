package oop.utvary;

import oop.Bod;

class Ctverec extends RovinnyUtvar{

    private Bod pocatek;
    private int delka;

    public Ctverec(Bod pocatek, int delka) {
        this.pocatek = pocatek;

        if (delka < 0) {
            delka = 0;
        }
        this.delka = delka;
    }

    public long obvod() {
        return 4 * delka;
    }

    public double obsah() {
        return delka * delka;
    }

    public static void posunX(Ctverec ctverec, int delka) {
        Bod.posunBodX1(ctverec.pocatek, delka);
    }

    public void posunX(int delka) {
        Bod.posunBodX1(pocatek, delka);
    }

    public static boolean majiPrunik(Ctverec ctv1, Ctverec ctv2) {
        if (((ctv2.pocatek.getX() <= ctv1.pocatek.getX() + ctv1.delka)
                && (ctv2.pocatek.getX() + ctv2.delka >= ctv1.pocatek.getX()))
             && ((ctv2.pocatek.getY() <= ctv1.pocatek.getY() + ctv1.delka)
                && (ctv2.pocatek.getY() + ctv2.delka >= ctv1.pocatek.getY()))) {
            return true;
        }

        return false;

    }

    public void vypis() {
        System.out.println("Vypis ctverce:");
        System.out.println("Pocatek ctverce je v bode:");
        pocatek.vypis();
        System.out.println("Delka ctverce je " + delka);
    }

    public static void main(String[] args) {
        Bod pocatekCtverce = new Bod(1, 2);

        Ctverec ctverec = new Ctverec(pocatekCtverce, 2);

        System.out.println("pocet instanci bodu je: " + Bod.getPocetInstanci());
        
        
        ctverec.vypis();
        System.out.println("Obvod ctverce je " + ctverec.obvod());

        ctverec.posunX(1);
        ctverec.vypis();

    }

}
