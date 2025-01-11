import java.util.Scanner;

public class Beton {
    // declaration des variables
    private static Scanner clavier = new Scanner(System.in);
    private static int ciments;
    private static int sables;
    private static int graviers;
    private  static int maxBeton;

    // declaration des CONSTANTES
    private static int MIN_CIMENTS = 350;
    private static int MIN_SABLES = 680;
    private static int MIN_GRAVIERS = 1175;

    public static void main (String [] args) {

        // initialisation de la variable ciment
        System.out.print("Entrez LA quantite de ciment : ");
        ciments = clavier.nextInt();

        // initialisation de la variable sables
        System.out.print("Entrez LA quantite de sables : ");
        sables = clavier.nextInt();

        // initialisation de la variable gravier
        System.out.print("Entrez LA quantite de graviers : ");
        graviers = clavier.nextInt();

        int tempMinBetonAvecCiment = ciments/MIN_CIMENTS;
        int tempMinBetonAvecSables = sables/MIN_SABLES;
        int tempMinBetonAvecGraviers = graviers/MIN_GRAVIERS;

        int firstMin = Math.min(tempMinBetonAvecCiment, tempMinBetonAvecSables);
        maxBeton = Math.min(tempMinBetonAvecGraviers, firstMin);

        // afficher le resultat
        System.out.println("Le volume maximun de beton possible est de : " + maxBeton + " metre cube ");

    }
}
