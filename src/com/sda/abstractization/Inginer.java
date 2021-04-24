package com.sda.abstractization;

public class Inginer extends Angajat implements ICalculProgram {
    private String domeniu;

    public Inginer(int id, double salariu, String nume, String telefon, String domeniu) {
        // apelare constructor clasa parinte
        super(id, salariu, nume, telefon);

        this.domeniu = domeniu;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    @Override
    public void calculOreProgram() {

    }

    @Override
    public int calcul(String start, String end) {
        return 0;
    }
}
