package com.sda.generictypes;

public class Incaltaminte implements Comparable<Incaltaminte>{
    private int size;

    public Incaltaminte(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Incaltaminte incaltaminte) {
        return this.size - incaltaminte.size;
    }
}
