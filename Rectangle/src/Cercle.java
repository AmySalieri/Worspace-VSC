package Rectangle.src;

public class Cercle extends Figuregeo {
    
    private int rayon; //le rayon du cercle voulu

    public Cercle() {
        rayon = 0; //constructeur vide, avec une valeur par défaut pour l'attribut rayon
    }

    public Cercle(int r) {
        this.rayon = r; //constructeur avec un rayon donné en paramètre
    }

    /*Comme l'attribut rayon de l'objet cercle est private,
    il faut utiliser une méthode pour récupérer sa valeur dans la méthode main (get)
    et une autre pour changer la valeur (set)*/
    public int getRayon() {
        return this.rayon;
    }

    public void setRayon(int r) {
        this.rayon = r;
    }
    /* Cette méthode calcule le périmètre du cercle grâce à la formule mathématique appropriée */
    public double getPerimetre() {
        return (rayon*2*Math.PI);
    }

    /* Cette méthode calcule l'aire du cercle grâce à la formule mathématique appropriée */
    public double getAire() {
        return (rayon*rayon*Math.PI);
    }
}
