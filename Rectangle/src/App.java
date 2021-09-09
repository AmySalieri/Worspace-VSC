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

        
        System.out.println("Largeur = " + r.getLargeur() + " et longueur = " + r.getLongueur());
        System.out.println("Périmètre: " + r.getPerimetre());
        System.out.println("Aire: " + r.getAire() + "cm².");


        sc.close();
    }
}
