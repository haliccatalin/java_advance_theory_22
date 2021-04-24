package com.sda.abstractization;

public class Paznic extends Angajat implements IFisaPostPaznic, ICalculProgram {
    private boolean hasGun;

    public Paznic(int id, double salariu, String nume, String telefon, boolean hasGun) {
        // apelare constructor clasa parinte
        super(id, salariu, nume, telefon);

        this.hasGun = hasGun;
    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }


    @Override
    public void calculOreProgram() {

    }

    @Override
    public int calcul(String start, String end) {
        return 0;
    }

    @Override
    public void registerEachPersonVisitBuilding() {

    }

    @Override
    public void offerInformation() {

    }
}
