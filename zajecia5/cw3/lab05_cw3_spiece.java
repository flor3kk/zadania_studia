public class lab05_cw3_spiece {
    String spiece;
    String name;
    int chromosomy;
    int basic_chromosomy;
    String opis;

    public lab05_cw3_spiece(String spiece, String name, int chromosomy, int basic_chromosomy, String opis){
        this.spiece = spiece;
        this.name  = name;
        this.chromosomy = chromosomy;
        this.basic_chromosomy = basic_chromosomy;
        this.opis = opis;
    }

    public void full_name(String spiece, String name){
        System.out.print("rodzja oraz gatunek: ");
        System.out.println(spiece + ", " + name);
    }

    public void haploidalna(int chromosomy){
        System.out.println("liczba haploidalna chromosomow: " + chromosomy / 2);
    }

    @Override
    public String toString() {
        return "Gatunek ------ " +
                "rodzaj = '" + spiece + '\'' +
                ", gatunek = '" + name + '\'' +
                ", chromosomy 2n =" + chromosomy +
                ", podstawowe chromosmy = " + basic_chromosomy +
                ", opis = '" + opis + "'";
    }

    // Z INTERNETU
    public lab05_cw3_spiece klonuj() {
        return new lab05_cw3_spiece(spiece, name, chromosomy, basic_chromosomy, opis);
        // Z INTERNETU
    }

}
