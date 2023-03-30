public class lab05_cw1_square {

    int a;
    double surface_square;
    double circumference_square;

    public lab05_cw1_square(int a){
        this.a = a;
    }

    public void square_surface(int a){
        surface_square = a*a;
    }
    public void square_circum(int a){
        circumference_square = a * 4;
    }

    @Override
    public String toString() {
        return "Kwadrat: {" +
                "bok a=" + a +
                ", pole=" + surface_square +
                ", obwod=" + circumference_square +
                '}';
    }

}
