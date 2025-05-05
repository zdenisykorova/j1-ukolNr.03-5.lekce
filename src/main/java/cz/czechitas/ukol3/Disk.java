package cz.czechitas.ukol3;

import java.util.Objects;

public class Disk {
    private long kapacitaDisk;
    private long vyuziteMisto;

    public long getKapacitaDisk() {
        return kapacitaDisk;
    }

    public void setKapacitaDisk(long kapacitaDisk) {
        Objects.requireNonNull(kapacitaDisk);
        if (kapacitaDisk < 0) {
            System.err.println("Kapacita disku nemůže být záporné číslo.");
        }
        this.kapacitaDisk = kapacitaDisk;
    }

    @Override
    public String toString() {
        return "kapacita disku" + kapacitaDisk + " byte;" + "vyuzite misto"+ vyuziteMisto + " byte";
    }
}
