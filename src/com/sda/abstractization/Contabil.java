package com.sda.abstractization;

public class Contabil extends Angajat implements IFisaPostContabil, ICalculProgram {
    private boolean hasExperience;

    public Contabil(int id, double salariu, String nume, String telefon, boolean hasExperience) {
        // apelare constructor clasa parinte
        super(id, salariu, nume, telefon);

        this.hasExperience = hasExperience;
    }

    public boolean isHasExperience() {
        return hasExperience;
    }

    public void setHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
    }

    @Override
    public void calculOreProgram() {

    }

    @Override
    public int calcul(String start, String end) {
        return 0;
    }

    @Override
    public void registerBill() {

    }

    @Override
    public void generateBill() {

    }

    @Override
    public void generateReports() {

    }
}
