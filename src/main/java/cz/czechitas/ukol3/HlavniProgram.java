package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

        public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPamet(100_999_888);
            System.out.println(mojePamet);

        Disk mujDisk = new Disk();
        mujDisk.setKapacitaDisk(300_999_888);
        mujDisk.setVyuziteMisto(234_567_890);
            System.out.println(mujDisk);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setNazevProcesor("Intel");
        mujProcesor.setRychlost(10_000_000);
            System.out.println(mujProcesor);

        Pocitac mujPocitac = new Pocitac();
        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);
        mujPocitac.zapniSe();
            System.out.println(mujPocitac);

        Pocitac mujPocitac1 = new Pocitac();
        mujPocitac.zapniSe();
        mujPocitac1.vypniSe();
        mujPocitac.vypniSe();


    }
}

