package Rectangle.src;

public class Cercle {
    
    private int rayon;

    public Cercle() {
        rayon = 0;
    }

    public Cercle(int r) {
        this.rayon = r;
    }

    public int getRayon() {
        return this.rayon;
    }

    public void setRayon(int r) {
        this.rayon = r;
    }
    
    public double getPerimetre() {
        return (rayon*2*Math.PI);
    }

    public double getAire() {
        return (rayon*rayon*Math.PI);
    }
}
