import java.util.Scanner;

public class Cylindre {

    // Declarer les variables
    private static Scanner clavier = new Scanner(System.in);
    private static double rayon;
    private static double hauteur;
    private static double volume;

    public static void main(String[] args) {

        // Initialiser le rayon
        System.out.print("Veuillez entrer un rayon pour le cylindre : ");
        rayon = clavier.nextDouble();

        // Initialiser la hauteur
        System.out.print("Veuillez entrer une hauteur pour le cylindre : ");
        hauteur = clavier.nextDouble();

        // Calcule du volume du cylindre => V = π x rayon² x hauteur
        volume = Math.PI * Math.pow(rayon, 2) * hauteur;

        // Afficher le volume trouve
        System.out.println("\nCYLINDRE");
        System.out.println("Rayon : " + rayon);
        System.out.println("Hauteur : " + hauteur);
        System.out.println("Le Volume du Cylindre est : " + volume + " unite3");
    }
}
