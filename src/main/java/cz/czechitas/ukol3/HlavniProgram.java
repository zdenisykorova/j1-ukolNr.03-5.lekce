package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

        public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPamet(100999888);
            System.out.println(mojePamet);

        Disk pevnyDisk = new Disk();
        pevnyDisk.setKapacitaDisk(100999888);
        pevnyDisk.setVyuziteMisto(234567890);
            System.out.println(pevnyDisk);

        Procesor cpu = new Procesor();
        cpu.setNazevProcesor("ava");
        cpu.setRychlost(10000000);
            System.out.println(cpu);

        Pocitac mujPocitac = new Pocitac();
        mujPocitac.setZapniSe(mujPocitac.zapniSe);
            System.out.println(mujPocitac);
    }

}
