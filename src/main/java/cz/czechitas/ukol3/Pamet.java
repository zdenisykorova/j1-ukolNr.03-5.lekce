package cz.czechitas.ukol3;

import java.util.Objects;

public class Pamet {
    private long kapacitaPamet;

    public long getKapacitaPamet() {
        return kapacitaPamet;
    }

    public void setKapacitaPamet(long kapacitaPamet) {
        Objects.requireNonNull(kapacitaPamet);
        if (kapacitaPamet < 0){
            System.err.println("Musí být vyplněna kapacita paměti počítače.");
        }
        this.kapacitaPamet = kapacitaPamet;
    }

    @Override
    public String toString() {
        return kapacitaPamet + " " + "byte";
    }
}
