package oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {

    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Katze> mKatzenliste = new ArrayList<>();
        Katze katze = new Katze();
        String[] charListe ={"bösartig","gutartig","hinterhältig","listig","schmusig","lieblich","lustig"};
        String[] nameListe ={"Hans","Heinz","Bertl","Sepp","Josef","Olaf","Gustav","Mert","Can"};
        String[] farbeListe ={"Rot","Blau","Grün","Gelb","Pink","Pink","Braun","Schwarz","Weiß"};
        String[] oberListe ={"glatt","rau","struppig","samtig","weich"};

        for (int i = 1; i<=100;i++) {
            int ci = r.nextInt(charListe.length - 1 - 0) + 0;
            int ni = r.nextInt(nameListe.length - 1 - 0) + 0;
            int ji = r.nextInt(farbeListe.length - 1 - 0) + 0;
            int ki = r.nextInt(oberListe.length - 1 - 0) + 0;
            int li = r.nextInt(25 + 1 - 0) + 0;
            mKatzenliste.add(new Katze(charListe[ci],oberListe[ki],li,farbeListe[ji],nameListe[ni] ));
        }
        katze.setAlter(1);
        katze.setCharacter("süß");
        katze.setFarbe("gescheckt");
        katze.setOberflächenbeschaffenheit("flauschig");
        katze.setName("Heinz");

        //System.out.println("Meine Katze "+katze.getName() + " ist " + katze.getAlter() + " alt!");

        for(Katze k : mKatzenliste){
            System.out.println("Meine Katze "+k.getName() + " ist " + k.getAlter() + " und ist " + k.getOberflächenbeschaffenheit() + ". " + "Meine Katze ist " + k.getFarbe() + ".");




        }
    }
}
