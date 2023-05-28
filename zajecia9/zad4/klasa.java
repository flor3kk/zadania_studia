package lab09.zad4;

public class klasa {

    String model;
    int moc;

    public klasa(String model, int moc) {
        this.model = model;
        this.moc = moc;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", moc=" + moc + "km";
    }
}
