public class LOOPS{

    public static void main(String[] args) {
        int summe = 0;

        for (int zahl = 2; zahl <= 1000; zahl += 2) {
            summe += zahl;
        }

        System.out.println("Die Summe der geraden Zahlen von 1 bis 1000 beträgt: " + summe);
    }
}

