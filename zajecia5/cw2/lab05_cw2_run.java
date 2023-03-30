public class lab05_cw2_run {
    public static void main(String[] args){

        lab05_cw2_building bud1 = new lab05_cw2_building("URz", 2011, 4);
        System.out.println(bud1);
        bud1.how_long(bud1.year);

        lab05_cw2_building bud2 = new lab05_cw2_building("PRz", 2010, 5);
        System.out.println(bud2);
        bud1.how_long(bud2.year);

        lab05_cw2_building bud3 = new lab05_cw2_building("Elektryk", 2001, 3);
        System.out.println(bud3);
        bud1.how_long(bud3.year);

        lab05_cw2_building bud4 = new lab05_cw2_building("Kopernik", 1994, 2);
        System.out.println(bud4);
        bud1.how_long(bud4.year);

        lab05_cw2_building bud5 = new lab05_cw2_building("Guzikówka", 123, 3);
        System.out.println(bud5);
        bud1.how_long(bud5.year);
    }
}
