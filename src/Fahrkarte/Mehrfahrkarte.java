package Fahrkarte;

public class Mehrfahrkarte extends Fahrkarte {
    private int fahrten;

    public Mehrfahrkarte(double preis, int fahrten) {
        super(preis);
        this.fahrten = fahrten;
    }
    //test
}
