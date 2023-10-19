import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kontostand = 0.0;

        while (true) {
            System.out.println("Bankautomat-Simulation");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
                    double einzahlung = input.nextDouble();
                    kontostand += einzahlung;
                    System.out.println("Einzahlung erfolgreich!");
                    break;
                case 2:
                    System.out.print("Geben Sie den Abhebungsbetrag ein: ");
                    double abhebung = input.nextDouble();
                    if (abhebung > kontostand) {
                        System.out.println("Nicht genügend Guthaben auf dem Konto.");
                    } else {
                        kontostand -= abhebung;
                        System.out.println("Abhebung erfolgreich!");
                    }
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + kontostand);
                    break;
                case 4:
                    System.out.println("Vielen Dank für die Nutzung des Bankautomaten. Auf Wiedersehen!");
                    System.exit(0);
                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
            }
        }
    }
}

