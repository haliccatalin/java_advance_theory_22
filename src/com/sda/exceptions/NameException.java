package com.sda.exceptions;

public class NameException extends Exception {

    // Trimite un mesaj pentru exceptia noastra, iar acesta
    // va fi trimis catre clasa parinte Exception
    // se va putea vedea cand se apeleaza metoda .getMessage();
    public NameException(String message) {
        super(message);
    }
}
