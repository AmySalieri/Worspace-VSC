package Rectangle.src;

public class Rectangle extends Figuregeo {
    
private int longueur;
private int largeur;

//constructeur vide avec valeurs par défaut pour ses attributs
public Rectangle() {
    this.longueur = 0;
    this.largeur = 0;
}

// constructeur avec la longueur et la largeur passés en paramètres
public Rectangle(int lon, int larg) {
    this.longueur = lon;
    this.largeur = larg;
}

/*Comme les attributs logueur et largeur de l'objet rectangle sont private,
    il faut utiliser une méthode pour récupérer leur valeur dans la méthode main (get)
    et une autre pour changer la valeur (set)*/
public int getLongueur() {
    return longueur;
}

public int getLargeur() {
    return largeur;
}

public void setLongueur(int lon) {
    longueur = lon;
}

public void setlargeur(int larg){
    largeur = larg;
}

/* Cette méthode calcule le périmètre du rectangle grâce à la formule mathématique appropriée */
@Override
public double getPerimetre(){
    return (longueur*2 + largeur*2);
}

/* Cette méthode calcule l'aire du rectangle grâce à la formule mathématique appropriée */
@Override
public double getAire(){
    return (longueur*largeur);
}
@Override
public void afficher(){
    System.out.println("Rectangle:");
    System.out.println("Largeur = " + this.getLargeur() + " et longueur = " + this.getLongueur());
    System.out.println("Périmètre: " + this.getPerimetre());
    System.out.println("Aire: " + this.getAire() + "cm².");
}

}
