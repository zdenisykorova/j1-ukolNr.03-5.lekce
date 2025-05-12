package cz.czechitas.ukol3;

import java.util.Objects;

public class Pocitac {

    private Procesor cpu;

    public Procesor getCpu() {
        return cpu;
    }
    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    private Pamet ram;

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    private Disk pevnyDisk;

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return cpu + "," + ram + "," + pevnyDisk;
    }

    boolean jeZapnuty = true;

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }





    //to ale není, co je v úkolu
    private long velikost;
    public long getVelikost() {
        return velikost;
    }
    public void setVelikost(long velikost) {
        Objects.requireNonNull(velikost);
        if (velikost < 0) {
            System.err.println("Napiš velikost souboru.");
        }
        this.velikost = velikost;
    }

    //to ale není, co je v úkolu
    public void vytvorSouborOVelikosti (long velikost, long vyuziteMisto, long kapacitaDisk) {

        if (velikost + vyuziteMisto > kapacitaDisk) {
            System.err.println("Kapacita disku je nedostatecna pro ulozeni souboru.");
        }
    }

}




