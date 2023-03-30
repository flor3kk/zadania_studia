public class lab05_cw1_circle {

    int radius;
    double surface_circle;
    double circumference_circle;

    public lab05_cw1_circle(int radius){
        this.radius = radius;
    }

    public void circle_surface(int a){
        surface_circle = Math.round(Math.PI*(Math.pow(a,2)));
    }
    public void circle_circum(int a){
        circumference_circle =  Math.round(Math.PI*2*a);
    }

    @Override
    public String toString() {
        return "Koło: {" +
                "radius=" + radius +
                ", pole=" + surface_circle +
                ", obwod=" + circumference_circle +
                '}';
    }

}
