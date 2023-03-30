public class lab05_cw1_cube {

    int a;
    double capacity_cube;
    double circum_cube;

    public lab05_cw1_cube(int a){
        this.a = a;
    }

    public void cube_cap(int a){
        capacity_cube = Math.round(Math.pow(a,3));
    }
    public void cube_circum(int a){
        circum_cube = 12 * a;
    }

    @Override
    public String toString() {
        return "Szescian: {" +
                "bok a=" + a +
                ", objetosc=" + capacity_cube +
                ", obwod=" + circum_cube +
                '}';
    }
}
