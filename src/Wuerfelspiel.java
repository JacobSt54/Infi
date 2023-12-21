import java.util.Scanner;
import java.util.Random;

public class Wuerfelspiel {
    public static int wurf() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Würfeln und eine Zahl zwischen 1 und 6 zurückgeben
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiterSpielen = true;

        while (weiterSpielen) {
            System.out.println("Willkommen zum Würfelspiel!");
            int spielerSumme = 0;
            int computerSumme = 0;

            for (int i = 0; i < 6; i++) {
                System.out.println("Drücke Enter, um zu würfeln...");
                scanner.nextLine();

                int spielerWurf = wurf();
                int computerWurf = wurf();

                System.out.println("Du hast eine " + spielerWurf + " gewürfelt.");
                System.out.println("Der Computer hat eine " + computerWurf + " gewürfelt.");

                spielerSumme += spielerWurf;
                computerSumme += computerWurf;
            }

            System.out.println("\nErgebnis:");
            System.out.println("Deine Augensumme: " + spielerSumme);
            System.out.println("Computer Augensumme: " + computerSumme);

            if (spielerSumme > computerSumme) {
                System.out.println("Glückwunsch! Du hast gewonnen!");
            } else if (spielerSumme < computerSumme) {
                System.out.println("Schade, der Computer hat gewonnen.");
            } else {
                System.out.println("Unentschieden!");
            }

            System.out.println("Möchtest du das Spiel erneut spielen? (ja/nein)");
            String antwort = scanner.nextLine();
            weiterSpielen = antwort.equalsIgnoreCase("ja");
        }
    }


}







