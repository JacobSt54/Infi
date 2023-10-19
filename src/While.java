import java.util.Random;

    public class While {
        public static void main(String[] args) {
            Random rand = new Random();
            int sum = 0;

            while (true) {
                int randomNumber = rand.nextInt(21) + 10; // Zufallszahl zwischen 10 und 30 generieren
                System.out.println("Zufallszahl: " + randomNumber);
                sum += randomNumber;

                if (randomNumber == 15 || randomNumber == 25) {
                    break;
                }
            }

            System.out.println("Das Programm wurde beendet.");
            System.out.println("Die Summe der vorherigen Zufallszahlen ist: " + sum);
        }
    }


