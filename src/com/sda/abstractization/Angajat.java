package com.sda.abstractization;

public abstract class Angajat {
    private int id;
    private double salariu;
    private String nume;
    private String telefon;

    public Angajat(int id, double salariu, String nume,String telefon) {
        this.id = id;
        this.salariu = salariu;
        this.nume = nume;
        this.telefon = telefon;
    }

    // metode abstracte
    // acestea sunt permise doar in clasele abstracte.
    // impreuna cu keywordul "abstract"
//    public abstract void calculOreProgram();

//    public abstract void supportSecurity();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public double getSalariu() {
        return this.salariu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return this.telefon;
    }
}
