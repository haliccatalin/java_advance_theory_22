package com.sda.abstractization;

public class Main {
    public static void main(String[] args) {
//        Clasele abstracte nu pot fi instantiate
//        adica nu putem creea obiecte cu constructorul clasei abstracte
//        Angajat angajat1 = new Angajat();

        Angajat angajat2 = new Contabil(1, 2000, "Popescu Ana", "1231231231", true);
        Contabil contabil1 = new Contabil(2, 3000, "Georgescu Mihai", "21312312123", true);

        contabil1.registerBill();
        contabil1.generateReports();
        contabil1.generateBill();
        contabil1.calculOreProgram();

        contabil1.isHasExperience();


        Paznic paznic1 = new Paznic(3, 1500, "Mitica De la liga", "12312312121", false);
        paznic1.registerEachPersonVisitBuilding();
        paznic1.offerInformation();
        paznic1.calculOreProgram();

    }
}
