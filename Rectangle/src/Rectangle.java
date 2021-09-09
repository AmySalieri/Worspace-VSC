package Rectangle.src;

public class Rectangle {
    
private int longueur;
private int largeur;

public Rectangle() {
    this.longueur = 0;
    this.largeur = 0;
}

public Rectangle(int lon, int larg) {
    this.longueur = lon;
    this.largeur = larg;
}

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

public int getPerimetre(){
    return (longueur*2 + largeur*2);
}

public int getAire(){
    return (longueur*largeur);
}

}
