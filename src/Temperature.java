import java.util.Scanner;

public class Temperature {

    // initialisation des variables
    private static Scanner clavier = new Scanner(System.in);
    private static double temperatureCelsius;
    private static double temperatureFahrenheit;

    public static void main (String [] args) {
        System.out.print("Entrez une temperature en degre celsius : ");
        temperatureCelsius = clavier.nextDouble();

        // calcule de la temperature en Fahrenheit a partir de la temperature en celsuis
        temperatureFahrenheit = (temperatureCelsius * 9/5) + 32;
        System.out.println("Temperature en Fahrenheit de " + temperatureCelsius + "°C est de " +
                ": " + temperatureFahrenheit + "°F");
    }
}
