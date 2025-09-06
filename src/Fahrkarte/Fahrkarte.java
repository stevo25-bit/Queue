package Fahrkarte;

public abstract class Fahrkarte {
    private double preis;
    private boolean gueltig;
    protected static double[] preisstufen = new double[]{1.8, 2.9, 3.8, 4.8, 5.6};

     //Konstuktor
    public Fahrkarte(double preis) {
        this.gueltig = true;
        this.preis = preis;
    }
    //Getter
    public double getPreis() {
        return preis;
    }
    //Getter
    public boolean getGueltig() {
        return gueltig;
    }
    // Methode entwerten
    protected void entwerten(){
        this.gueltig=false;
    }

    @Override
    public String toString(){
        return String.valueOf(this.preis);
    }
}