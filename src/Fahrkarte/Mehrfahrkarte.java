package Fahrkarte;

public class Mehrfahrkarte extends Fahrkarte implements Rueckfahrt {
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
    public boolean nutzen() {
        if (getGueltig()) {
            this.fahrten--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean nutzen (boolean mitRueckfahrt)
    {
        if (!mitRueckfahrt) return nutzen ();
        else if (fahrten >= 2)
        {
            nutzen ();
            nutzen ();
            return true;
        }
        else return false;
    }
}
