package Rectangle.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur:");
        r.setLongueur(sc.nextInt());
        System.out.println("Entrez la largeur");
        r.setlargeur(sc.nextInt());

        Cercle c = new Cercle();
        System.out.println("Entrez le rayon du cercle:");
        c.setRayon(sc.nextInt());

        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Rectangle:");
        System.out.println("Largeur = " + r.getLargeur() + " et longueur = " + r.getLongueur());
        System.out.println("Périmètre: " + r.getPerimetre());
        System.out.println("Aire: " + r.getAire() + "cm².");

        System.out.println("Cercle:");
        System.out.println("Périmètre: " + c.getPerimetre());
        System.out.println("Aire: " + c.getAire() + "cm².");

        if (t.isRectangle()) {
            System.out.println("Le triangle t est rectangle!");
        } else {
            System.out.println(t.getHypothenuse());
        }
        System.out.println(t.getAire());
        System.out.println(t.getPerimetre());

        sc.close();
    }
}
