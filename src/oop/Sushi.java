package oop;

public class Sushi {
    private String name;
    private int preis;
    private String groesse;
    private String kategorie;

    public Sushi(String name, int preis, String groesse, String kategorie) {
        this.name = name;
        this.preis = preis;
        this.groesse = groesse;
        this.kategorie = kategorie;
    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }

    public String getGroesse() {
        return groesse;
    }

    public String getKategorie() {
        return kategorie;
    }
}


