package cz.czechitas.ukol3;

import java.util.Objects;

public class Procesor {

    private String nazevProcesor;

    public String getNazevProcesor() {
        return nazevProcesor;
    }

    public void setNazevProcesor(String nazevProcesor) {
        Objects.requireNonNull(nazevProcesor);
        if (nazevProcesor.isBlank()) {
            System.err.println("Napis nazev procesoru.");
            return;
        }
        this.nazevProcesor = nazevProcesor;
    }

    private long rychlost;

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        Objects.requireNonNull(rychlost);
        if (rychlost < 0) {
            System.err.println("Musi byt vyplnena rychlost pocitace.");
            return;
        }
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return "Procesor " + nazevProcesor + ";" + " rychlost " + rychlost + " byte";
    }
}
