package oop.pisemka;

public class Nakladak extends Vozidlo{
    private int objemNavesu;

    public Nakladak(int objemNavesu, double obsahMotoru, String spz) {
        super(obsahMotoru, spz);
        this.objemNavesu = objemNavesu;
    }
    
    @Override
    public double spotreba() {
        return getObsahMotoru() * objemNavesu / 1000;        
    }

    @Override
    public void info() {
        System.out.println("Nakladak: ");
        super.info();
        System.out.println("objemNavesu = " + objemNavesu);
    }

    public int getObjemNavesu() {
        return objemNavesu;
    }
}
