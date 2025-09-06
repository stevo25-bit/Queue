package Fahrkarte;

public class Mehrfahrkarte extends Fahrkarte {
    private int fahrten;

    public Mehrfahrkarte(double preis, int fahrten) {
        super(preis);
        this.fahrten = fahrten;
    }

    @Override
    public String toString() {
        return String.valueOf(getPreis()) + " " + String.valueOf(this.fahrten);
    }

    // Überschreiben
    @Override
    public boolean isGueltig() {
        if (getGueltig()) {
            this.fahrten--;
            return true;
        } else {
            return false;
        }
    }
}
