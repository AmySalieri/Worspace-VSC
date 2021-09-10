package Rectangle.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur:");
        r.setLongueur(sc.nextInt());
        System.out.println("Entrez la largeur");
        r.setlargeur(sc.nextInt());

        Cercle c = new Cercle();
        System.out.println("Entrez le rayon du cercle:");
        c.setRayon(sc.nextInt());

        Triangle t = new Triangle(7, 3, 5);

        Figuregeo fg = new Figuregeo();
        fg.afficher();

        r.afficher();
        c.afficher();
        t.afficher();

        sc.close();
    }
}
