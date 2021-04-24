package com.sda.inheritance.shapes;

// prin definitie in interfete se definesc metode care sunt abstracte
// toate metodele din interfeta sunt PUBLICE prin definitie
public interface IShape {
    // metode abstracte, pentru ca nu au bloc de cod.
    double getPerimeter();

    double getArea();

    // keyword-ul "default" ne permite sa avem bloc de cod
    // in interiorul interfetei (este de la java 9 in sus)
    // default este valabil doar in cazul interfetelor
    // metodele cu bloc de cod din interfete NU trebuie implementate este OPTIONAL
    default void printMessage() {
        System.out.println("Print message from interface!");
    }
}

// Interface                    vs             Abstract Class
// nu avem constructor                         avem constructor
// nu avem variabile                           avem variabile
// avem metode cu bloc de cod                  avem metode cu bloc de cod
// avem metode fata bloc de cod                avem metode fara bloc de cod
// implements - pentru implementare            extends - pentru mostenire
// o clasa poate sa implementeze o             o clasa poate avea un singur parinte
//     infinitate de interfete