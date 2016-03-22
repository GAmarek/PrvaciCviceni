package oop.pisemka;


public abstract class Vozidlo {

    private static int najetoCelkem = 0;

    private double obsahMotoru;
    private String spz;
    private int najeto;

    public Vozidlo(double obsahMotoru, String spz) {
        this.obsahMotoru = obsahMotoru;
        this.spz = spz;
        najeto = 0;
    }

    public void info(){
        System.out.println("spz = " + getSpz() + 
                ", obsah motoru = " + obsahMotoru +
                ", najeto " + najeto +
                ", spotreba = " + spotreba());
        
    }

    public abstract double spotreba();

    public void cesta(int delka) {
        najeto += delka;
        najetoCelkem += delka;
    }
    
    public double getObsahMotoru() {
        return obsahMotoru;
    }

    public String getSpz() {
        return spz;
    }

    public static int getNajetoCelkem(){
        return najetoCelkem;
    }
    
}
