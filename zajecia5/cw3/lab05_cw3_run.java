public class lab05_cw3_run {
    public static void main(String[] args){

        lab05_cw3_spiece gatunek1 = new lab05_cw3_spiece("owad", "pszczola", 42, 21,"pszczola bez czola");
        gatunek1.full_name(gatunek1.spiece, gatunek1.name);
        gatunek1.haploidalna(gatunek1.chromosomy);
        System.out.println(gatunek1.toString());

        // Z INTERNETU
        lab05_cw3_spiece klon = gatunek1.klonuj();
        System.out.print(klon);
        // Z INTERNETU
    }

}
