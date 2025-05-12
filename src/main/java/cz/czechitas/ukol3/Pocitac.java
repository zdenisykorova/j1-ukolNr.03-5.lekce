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
            System.err.println("Vypis procesor. Pocitac se nezapnul.");
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
            System.err.println("Vypis pamet. Pocitac se nezapnul.");
        }
        this.ram = ram;
    }

    private Disk pevnyDisk;

    public Disk getPevnyDisk() {
        Objects.requireNonNull(pevnyDisk); //nic to nedělá
        if (pevnyDisk == null) {
            System.err.println("Vypis disk. Pocitac se nezapnul.");
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

    boolean jeZapnuty = true;

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public void zapniSe() {
        this.jeZapnuty = jeZapnuty;
        System.out.println("Pocitac se zapnul.");

        while (jeZapnuty) {
            if (jeZapnuty) ;
            System.err.println("Pocitac nejde zapnout dvakrat.");
            return;
        }
    }

    public void vypniSe() {
            this.jeZapnuty = !jeZapnuty;
            System.out.println("Pocitac se vypnul.");
    //je možné opakované vypnutí a nic se nestane, ale hláška o vypnutí se vypíše.
            while (!jeZapnuty) {
                if (!jeZapnuty);
                return;
            }
        }

        //co se tou metodou na přičtení???
    private long velikost;
    public long getVelikost() {
        return velikost;
    }
    public void setVelikost(long velikost) {
        this.velikost = velikost;
        return;
    }

    public void vytvorSouborOVelikosti (long velikost, Disk vyuziteMisto) {

        long = velikost += vyuziteMisto;

        }




    public void vymazSouborOVelikosti (long velikost) {

        }

    }







