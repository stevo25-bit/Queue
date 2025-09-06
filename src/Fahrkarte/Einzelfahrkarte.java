package Fahrkarte;

public class Einzelfahrkarte extends Fahrkarte{
    public Einzelfahrkarte(double preis) {
        super(preis);
    }
    public Einzelfahrkarte (int preisstufe)
    {
        super (preisstufen[preisstufe - 1]);
    }

    @Override
    public String toString(){
        if (getGueltig()){
            return String.valueOf(getPreis()) + " Not Entwertet";
        }
        else {
            return String.valueOf(getPreis())  + " Entwertet";
        }

    }

    @Override
    public boolean nutzen() {
        if(getGueltig()) {
            entwerten();
            return true;
        }else {
            return false;
        }

    }

}



