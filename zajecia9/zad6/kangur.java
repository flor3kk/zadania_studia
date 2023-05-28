package lab09.zad6;

public class kangur {
    int nrKangura;

    public kangur(int nrKangura) {
        this.nrKangura = nrKangura;
    }

    public void skok(){
        System.out.println("podskok kangura nr: " + nrKangura);
    }


    @Override
    public String toString() {
        return "nrKangura=" + nrKangura;

    }
}
