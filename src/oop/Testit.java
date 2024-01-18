package oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList();
        Katze katze = new Katze ();
        String [] charListe = {"bösartig","gutartig","hinterhältig","lustig","schmusig","lieblich","fotzig"};
        String [] nameListe = {"Julia","Berke","Elias","Elija","Nathanael","Ani","Jacob"};
        String [] farbeListe = {"braune","schwarze","graue","weiße","karrierte"};
        String [] oberListe = {"glatt","kurzhaar","rau","samtig","weich","flauschig"};
        int[] alterListe= {3,2,1,4,5,6,10,11};
        for (int i = 1; i<100;i++) {
            //int randomNumber = random.nextInt(max + 1 - min) + min;
            int ci = r.nextInt(charListe.length - 1 -0) + 0;
            int ni = r.nextInt(nameListe.length - 1 -0) + 0;
            int fi = r.nextInt(farbeListe.length - 1 -0) + 0;
            int oi = r.nextInt(oberListe.length - 1 -0) + 0;
            int ai = r.nextInt(alterListe.length -1 - 0) +0;
            mKatzenListe.add(new Katze(charListe[ci],oberListe[ni],alterListe[ai],farbeListe[oi],nameListe[ai]));
        }
        katze.setAlter(2);
        katze.setCharakter("bösartig");
        katze.setFarbe("karriert");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Mitzi");

        Katze katze2 = new Katze ("nette","weich",6,"weiße","Snow");
        mKatzenListe.add(katze2);

        int katzenzaehler = 1;

        Haus haus = new Haus(350,"Heaststraße 24, 88732 Hamburg",8,5);
        haus.getInfo();


        //System.out.println("Meine Katze "+katze.getName() + " ist " + katze.getAlter() + " Jahre alt!");
        for (Katze k : mKatzenListe) {
            System.out.println("Meine Katze " + k.getName() + " ist " + k.getAlter() + " Jahre alt, sie ist eine " + k.getCharakter() + " " + k.getFarbe() + " und " + k.getOberflaechenbeschaffenheit() + "e" + " Katze.");


            haus.addKatze(k);
        }

        haus.getKatzenImHaus();
    }
}