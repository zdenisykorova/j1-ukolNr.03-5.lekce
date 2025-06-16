package cz.czechitas.ukol3;

import java.util.Objects;

public class Pocitac {

    private Procesor cpu;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        Objects.requireNonNull(cpu); //nic to nedělá
        if (cpu == null) {
            System.err.println("Vypis procesor.");
            return;
        }
        this.cpu = cpu;
    }

    private Pamet ram;

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        Objects.requireNonNull(ram); //nic to nedělá
        if (ram == null) {
            System.err.println("Vypis pamet.");
        }
        this.ram = ram;
    }

    private Disk pevnyDisk;

    public Disk getPevnyDisk() {
        Objects.requireNonNull(pevnyDisk); //nic to nedělá
        if (pevnyDisk == null) {
            System.err.println("Vypis disk.");
        }
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return cpu + "," + ram + "," + pevnyDisk;
    }

    //boolean jeZapnuty = true; //špatně
    boolean jeZapnuty = false;

    public boolean JeZapnuty() {
        return jeZapnuty;
    }

    //public void setJeZapnuty(boolean jeZapnuty) {
        //this.jeZapnuty = jeZapnuty;}  //špatně oba řádky

    public void zapniSe() {

        if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Pocitac se nezapnul.");
            return;
        }

        //this.jeZapnuty = jeZapnuty; //špatně
        //System.out.println("Pocitac se zapnul."); //špatně
        if (jeZapnuty) {
            System.err.println("Pocitac nejde zapnout dvakrat.");
            return;
        }
        jeZapnuty = true;
    }

    public void vypniSe() {
            //this.jeZapnuty = !jeZapnuty; //špatně
            //System.out.println("Pocitac se vypnul."); //špatně

                if (!jeZapnuty) {
                return;
            }
                jeZapnuty = false;
        }


        //přičtení,odečtení - část 2

    public void vytvorSouborOVelikosti (long velikost) {
        long aktualni = pevnyDisk.getVyuziteMisto();
        pevnyDisk.setVyuziteMisto(aktualni + velikost);
        return;
        }

    public void vymazSouborOVelikosti (long velikost) {
        long aktualni1 = pevnyDisk.getVyuziteMisto();
        pevnyDisk.setVyuziteMisto(aktualni1 - velikost);
        return;
        }

    }







