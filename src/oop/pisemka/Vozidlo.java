package oop.pisemka;

import java.security.InvalidParameterException;

public abstract class Vozidlo implements Comparable<Vozidlo> {

    private static int najetoCelkem = 0;

    private double obsahMotoru;
    private String spz;
    private int najeto;

    public Vozidlo(double obsahMotoru, String spz) {
        this.obsahMotoru = obsahMotoru;
        this.spz = spz;
        najeto = 0;
    }

    public void vypis() {
        System.out.println("spz = " + getSpz()
                + ", obsah motoru = " + obsahMotoru
                + ", najeto " + najeto
                + ", spotreba = " + spotreba());

    }

    public abstract double spotreba();

    public void cesta(int delka) throws CestaException{
        if(delka < 0){
            throw new CestaException();
        }
        
        najeto += delka;
        najetoCelkem += delka;
    }

    public double getObsahMotoru() {
        return obsahMotoru;
    }

    public String getSpz() {
        return spz;
    }

    public static int getNajetoCelkem() {
        return najetoCelkem;
    }

    @Override
    public int compareTo(Vozidlo o) {
        return this.getSpz().compareTo(o.getSpz());
    }

}
