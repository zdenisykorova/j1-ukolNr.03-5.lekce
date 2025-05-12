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

    public void zapniSe() {
        this.jeZapnuty = jeZapnuty;
        System.out.println("Pocitac se zapnul.");

        while (jeZapnuty) {
            if (jeZapnuty) ;
            System.err.println("Pocitac nejde zapnout dvakrat.");

            return;
        }

        //ř.64-77 nejak nejdou spustit v hlavní metodě
        if (cpu == null) {
            System.err.println("Vypis procesor.Pocitac se nezapnul.");
            return;
        }

        if (ram == null) {
            System.err.println("Vypis pamet.Pocitac se nezapnul.");
            return;
        }

        if (pevnyDisk == null) {
            System.err.println("Vypis disk.Pocitac se nezapnul.");
            return;
        }

    }

    public void vypniSe() {
        this.jeZapnuty = !jeZapnuty;
        System.out.println("Pocitac se vypnul.");


    }
}






