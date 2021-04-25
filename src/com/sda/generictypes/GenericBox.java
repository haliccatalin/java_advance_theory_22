package com.sda.generictypes;

//<T> - este vorba de o clasa generica
// T => String, Dog, Animal, Car orice alta clasa
public class GenericBox<T> {
//    private String item;
    private T item;

//    public GenericBox(String item) {
//        this.item = item;
//    }

    public GenericBox(T item) {
        this.item = item;
    }
//
//    public void setItem(String item) {
//        this.item = item;
//    }

    public void setItem(T item) {
        this.item = item;
    }

//    public String getItem() {
//        return this.item;
//    }

    public T getItem() {
        return this.item;

    }


}
