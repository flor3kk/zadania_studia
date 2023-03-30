public class lab05_cw1_cuboid {
    int a,b,c;
    double capacity_cuboid;
    double surface_cubiod;

    public lab05_cw1_cuboid(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void cuboid_cap(int a, int b, int c){
        capacity_cuboid = a * b * c;
    }
    public void cuboid_surface(int a, int b, int c){
        surface_cubiod = Math.round(Math.pow(a,2)*2 + Math.pow(b, 2)*2 + Math.pow(c, 2)*2);
    }

    @Override
    public String toString() {
        return "Prostopadloscian{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", objetosc=" + capacity_cuboid +
                ", pole=" + surface_cubiod +
                '}';
    }
}
