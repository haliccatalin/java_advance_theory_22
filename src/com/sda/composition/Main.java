package com.sda.composition;

public class Main {
    public static void main(String[] args) {
//        Aceste linii de cod fac acelasi lucru
//        unul este fara constructor, iar celalalt foloseste constructorul din clasa String
//        String name = "Catalin";
//        String name1 = new String("Catalin");


        Monitor monitor = new Monitor(1024.6);
        Mouse mouse = new Mouse(3, 800, "Alb");

        Computer computer = new Computer(mouse, monitor);

        System.out.println(computer.getMonitor().getResolution());
        Monitor m = computer.getMonitor();
        System.out.println(m.getResolution());
    }
}
