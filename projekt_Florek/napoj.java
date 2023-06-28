package projekt;

public class napoj {
    String name;
    double price;

    public napoj( String name, double price) {
        setPrice(price);
        setName(name);
    }

    public void setPrice(double price) {
        if (price < 0) this.price = 0;
        else this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == "")
            this.name = "default";
        else
            this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + " - " + price;
    }
}
