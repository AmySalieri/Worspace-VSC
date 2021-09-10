package Rectangle.src;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle extends Figuregeo{

    int cote1;
    int cote2;
    int cote3;

    //constructeur vide avec valeurs par défaut pour ses attributs
    public Triangle(){
        this.cote1 = 0;
        this.cote2 = 0;
        this.cote3 = 0;
    }

    // constructeur avec les côtés du triangle passés en paramètres
    public Triangle(int c1, int c2, int c3) {
        this.cote1 = c1;
        this.cote2 = c2;
        this.cote3 = c3;
    }

    /*Cette méthode fait une liste des côtés du triangle, triés du plus grand au plus petit*/ 
    public ArrayList<Integer> findHypothenuse(){
        ArrayList<Integer> hypo = new ArrayList<Integer>(); //création de la liste
        hypo.add(cote1);
        hypo.add(cote2);
        hypo.add(cote3); //ajout des trois côtés
        Collections.sort(hypo, Collections.reverseOrder()); //tri de la liste du plus grand au plus petit
        return hypo;
    }

    /* Cette méthode utilise la méthode précédente pour déterminer quel côté est l'hypothénuse du triangle */
    public int getHypothenuse() {
        ArrayList<Integer> hypo = this.findHypothenuse(); //crée et trie la liste
        return hypo.get(0); //retourne la valeur du premier élément de la liste (l'hypothénuse)
    }

    /*Cette méthode détermine si le triangle est un triangle rectangle */
    public boolean isRectangle(){
        ArrayList<Integer> hypo = this.findHypothenuse(); //crée et trie la liste des côtés
        boolean rect = false; //la valeur boolean qui sera retournée, initialisée pour renvoyer false si la condition n'est pas remplie
        if (hypo.get(0)*hypo.get(0) == (hypo.get(1)*hypo.get(1) + hypo.get(2)*hypo.get(2))) { //teste si le triangle est rectangle grâce au Théorème de Pythagore
            rect = true; //changement de la variable boolean à retourner si la condition est remplie
        }
        return rect; //variable boolean retournée après le test
    }

    /* Cette méthode calcule le périmètre du triangle grâce à la formule mathématique appropriée */
    public double getPerimetre() {
        return (cote1 + cote2 + cote3);
    }

    /* Cette méthode calcule l'aire du triangle grâce à la formule mathématique appropriée */
    public double getAire() {
        ArrayList<Integer> hypo = this.findHypothenuse(); //crée et trie la liste des côtés
        double aire; //crée la variable aire à retourner
        if (this.isRectangle()) { //teste si le triangle est rectangle pour déterminer la formule mathématique appropriée
            aire = (hypo.get(1)*hypo.get(2))/2; 
        } else {
            double demip = this.getPerimetre()/2;
            aire = Math.sqrt(demip*(demip - hypo.get(0))*(demip - hypo.get(1))*(demip - hypo.get(2)));
        }
        return aire; //retourne le résultat du calcul approprié
    }
    
}
