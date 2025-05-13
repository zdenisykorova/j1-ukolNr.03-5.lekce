package cz.czechitas.ukol3;

import java.util.Objects;

public class Disk {
    private long kapacitaDisk;

    public long getKapacitaDisk() {
        return kapacitaDisk;
    }

    public void setKapacitaDisk(long kapacitaDisk) {
        Objects.requireNonNull(kapacitaDisk);
        if (kapacitaDisk < 0) {
            System.err.println("Kapacita disku nemůže být záporné číslo.");
            return;
        }
        this.kapacitaDisk = kapacitaDisk;
    }

    private long vyuziteMisto;

        public long getVyuziteMisto() {
            return vyuziteMisto;
        }

        public void setVyuziteMisto(long vyuziteMisto) {
            Objects.requireNonNull(vyuziteMisto);
            if (vyuziteMisto < 0) {
                System.err.println("Vyuzite misto nemuze byt zaporne cislo.");
                return;
            }
                this.vyuziteMisto = vyuziteMisto;

            Objects.requireNonNull(vyuziteMisto);
            if (vyuziteMisto > kapacitaDisk) {
                System.err.println("Neni misto na disku.");
            }
                this.vyuziteMisto = vyuziteMisto;
        }

    @Override
    public String toString() {
        return "kapacita disku " + kapacitaDisk + " byte;" + " vyuzite misto "+ vyuziteMisto + " byte";
    }
}
