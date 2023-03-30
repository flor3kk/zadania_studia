public class lab05_cw1_rectangle {

    int a, b;
    double surface_rectangle;
    double circumference_rectangle;

    public lab05_cw1_rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void rectangle_surface(int a, int b){
        surface_rectangle = a * b;
    }
    public void rectangle_circum(int a, int b){
        circumference_rectangle = 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "prostokąt: {" +
                "bok a=" + a +
                ", bok b=" + b +
                ", pole=" + surface_rectangle +
                ", obwod=" + circumference_rectangle +
                '}';
    }
}
