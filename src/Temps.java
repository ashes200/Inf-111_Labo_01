import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Temps {
    // declaration des variables
    private static Scanner clavier = new Scanner(System.in);
    private static int secondes;
    private static int minutes;
    private static int heurs;

    public static void main (String [] args) {
        System.out.print("Entrez une duree de temps en secondes : ");
        secondes = clavier.nextInt();

        //cacule de la duree
        if (secondes/60 > 59) { // si la duree est d'au moins 1 heure
            int tempSecondes;
            heurs = secondes / (60*60);
            tempSecondes = secondes % (60*60);
            minutes = tempSecondes/60;
            secondes = tempSecondes % 60;
        } else if (secondes/60 < 1) { // si la duree est d'au moins 1 minute
            heurs = 0;
            minutes = 0;
        } else { // si la duree est plus petite q'une minute
            heurs = 0;
            minutes = secondes/60;
            secondes = secondes % 60;
        }

        System.out.println("Duree :\nHeures : " + heurs + "h; Minutes : " + minutes + "min; Secondes : " + secondes + "sec");
    }
}
