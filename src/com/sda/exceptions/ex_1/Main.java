package com.sda.exceptions.ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (0 < 1) {
            try {
                System.out.print("Introduceti un numar: ");

                if(scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " -> int");
                } else if(scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble() + " -> double");
                } else {
                    throw new Exception("Hey! That’s not a value! Try once more.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }




    }
}
