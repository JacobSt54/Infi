package oop;


import java.util.List;
import java.util.Random;

public class TestSushi {
    public static void main(String[] args) {
        SushiFoerderband foerderband = new SushiFoerderband();

        List<String> namen = List.of("Lachs", "Thunfisch", "Garnele", "Aal", "Avocado", "Gurke", "Oktopus", "Gelbschwanz", "Jakobsmuschel", "Tintenfisch");
        List<String> groessen = List.of("Klein", "Mittel", "Groß");
        List<String> kategorien = List.of("Nigiri", "Maki", "Sashimi", "Rolle");
        List<Integer> preise = List.of(8, 6, 10, 12, 15, 7, 9, 11, 14, 13);
        Random zufall = new Random();


        for (int i = 0; i < 10; i++) {
            String name = namen.get(zufall.nextInt(namen.size()));
            String groesse = groessen.get(zufall.nextInt(groessen.size()));
            String kategorie = kategorien.get(zufall.nextInt(kategorien.size()));
            int preis = preise.get(zufall.nextInt(preise.size()));

            Sushi sushi = new Sushi("Sushi " + (i + 1) + " - " + name, preis, groesse, kategorie);
            foerderband.fuegeSushiHinzu(sushi);
        }


        for (int i = 0; i < 15; i++) {
            Sushi sushi = foerderband.holeNaechstesSushi();
            if (sushi != null) {
                System.out.println("Kunde hat " + sushi.getName() + " (" + sushi.getGroesse() + ", " + sushi.getKategorie() + ") fuer €" + sushi.getPreis() + " genommen");
            }
        }
    }
}