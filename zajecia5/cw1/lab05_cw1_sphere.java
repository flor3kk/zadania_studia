public class lab05_cw1_sphere {

    int radius;
    double capacity_sphere;
    double surface_sphere;

    public lab05_cw1_sphere(int radius){
        this.radius = radius;
    }

    public void sphere_cap(int radius){
        capacity_sphere = Math.round(4 * Math.PI * (Math.pow(radius,2)));
    }
    public void sphere_surface(int radius){
        surface_sphere = Math.round(Math.PI * Math.pow(radius, 3) * (4/3));
    }

    @Override
    public String toString() {
        return "Kula{" +
                "promien=" + radius +
                ", objetosc=" + capacity_sphere +
                ", pole=" + surface_sphere +
                '}';
    }
}
