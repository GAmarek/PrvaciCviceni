package oop.pisemka;

public class Auto extends Vozidlo{
    
    private static final double KOEF_DIESEL = 0.8; 
    
    private boolean benzinak;

    public Auto(boolean benzinak, int obsahMotoru, String spz) {
        super(obsahMotoru, spz);
        this.benzinak = benzinak;
    }
    
    @Override
    public double spotreba() {
        double koef = benzinak ? 1 : KOEF_DIESEL;
        
        return getObsahMotoru() * koef / 1000; 
    }

    @Override    
    public void info() {
        System.out.println("Auto: ");
        super.info();
        System.out.println("benzinak = " + benzinak);
    }
}
