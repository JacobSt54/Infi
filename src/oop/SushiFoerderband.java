package oop;

import java.util.ArrayList;
import java.util.List;

public class SushiFoerderband {
    private List<Sushi> foerderband;
    private int aktuellePosition;

    public SushiFoerderband() {
        foerderband = new ArrayList<>();
        aktuellePosition = 0;
    }

    public void fuegeSushiHinzu(Sushi sushi) {
        foerderband.add(sushi);
    }

    public Sushi holeNaechstesSushi() {
        if (aktuellePosition < foerderband.size()) {
            return foerderband.get(aktuellePosition++);
        } else {
            System.out.println("Kein weiteres Sushi auf dem Foerderband.");
            return null;
        }
    }
}