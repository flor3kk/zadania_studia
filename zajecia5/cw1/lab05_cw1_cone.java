public class lab05_cw1_cone {

    int radius;
    int height;
    double capacity_cone;
    double surface_cone;

    public lab05_cw1_cone(int radius, int height){
        this.radius = radius; this.height = height;
    }

    public void cone_cap(int radius, int height){
        capacity_cone = Math.round((Math.PI * Math.pow(radius, 2) * height) / 3);
    }
    public void cone_surface(int radius, int height){
        surface_cone = Math.round(Math.PI * Math.pow(radius,2) + Math.PI * radius * Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)));
    }

    @Override
    public String toString() {
        return "Stozek:{" +
                "promien=" + radius +
                ", wysokosc=" + height +
                ", objetosc=" + capacity_cone +
                ", pole=" + surface_cone +
                '}';
    }
}