package com.sda.collections;

import java.util.*;

public class ListSample {

    public static void main(String[] args) {
//        String[] names = new String[54];
//
//        names[0] = "Ion";
//        names[1] = "Maria";
//        names[20] = "Mircea";
//
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        System.out.println(names.length);
//        System.out.println(names[2]);

//        Putem intializa o interfata cu constructorul unei clase DOAR DACA
//        class implementeza interfata
        // list = interfata          arraylist = class
        List<String> namesList = new ArrayList<>();

//        Colectiile functioneaza DOAR cu obiecte!
        List<Integer> numbers = new ArrayList<>();

        // Adaugare elemente in lista, elementul va fi adaugat la sfarsit.
        namesList.add("Ion");
        namesList.add("Maria");
        namesList.add("Mircea");

        for (int i = 0; i < namesList.size(); i++) {
            // preluarea unui element din lista
            System.out.println(namesList.get(i));
        }

        namesList.add("Diana");
        namesList.add("Mihai");

        System.out.println("------------");

        //stergem un element din lista
        namesList.remove(0);

        // stergerea unui obiect folosind obiectul
        namesList.remove("Diana");

        // cautarea unui obiect in lista
        // contains returneaza true sau false, daca e prezent sau nu in lista
        if (namesList.contains("Mihai")) {
            System.out.println("Mihai e prezent in lista");
        } else {
            System.out.println("Nu este in lista");
        }

        for (int i = 0; i < namesList.size(); i++) {
            // preluarea unui element din lista
            System.out.println(namesList.get(i));
        }
    }

    /**
     * Create a List and display its result (data should be provided by the user - console):
     * a) Purchases to be made. *If an element already exists on the list, then it should
     * not be added.
     * b) *Add to the example above the possibility of "deleting" purchased elements
     * c) Display only those purchases that start with „m” (e.g. milk)
     * d) * View only purchases whose next product on the list starts with „m” (e.g. eggs,
     * if milk was next on the list)
     */
    public static void ex1() {
        List<String> itemsList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String item = "";
        // while(true) -> reprezinta un loop infinit
        while (true) {
            System.out.println("Element: ");
            // citim de la tastatura
            item = scanner.nextLine();

            if (item.equals("stop")) {
                break;
            }

            if (itemsList.contains(item)) {
                System.out.println("Elementul este deja prezent!");
                System.out.println("Doresti sa il stergi? (y/n)");

                // citim raspunsul dat de user
                String response = scanner.next();

                if (response.equals("y")) {
                    itemsList.remove(item);
                    break;
                }

            } else {
                // adaugam elementul in lista
                itemsList.add(item);
            }
        }

        // afisam rezultatele
        for (String element : itemsList) {
            if (element.startsWith("m")) {
                System.out.println(element);

            }
        }

        System.out.println("----------");

        for (int i = 0; i < itemsList.size(); i++) {
            String element = itemsList.get(i);

            if (element.startsWith("m")) {
                if (i != 0) {
                    System.out.println(itemsList.get(i - 1));
                }
                System.out.println(element);

            }
        }
    }

    public static void ex3() {
        List<List<String>> brandsList = new ArrayList<>();

        List<String> modelsAudi = new ArrayList<>();
        modelsAudi.add("A4");
        modelsAudi.add("A5");

        List<String> modelsBmw = new ArrayList<>();
        modelsBmw.add("e39");
        modelsBmw.add("e36");
        modelsBmw.add("e30");

        List<String> modelsOpel = new ArrayList<>();
        modelsOpel.add("astra");
        modelsOpel.add("vectra");

        brandsList.add(modelsAudi);
        brandsList.add(modelsBmw);
        brandsList.add(modelsOpel);

        for(int i = 0; i < brandsList.size(); i++) {
            // in carModels salvam fiecare pozitie din lista de branduri
            List<String> carModels = brandsList.get(i);

            for(int j = 0; j < carModels.size(); j++) {
                String model = carModels.get(j);

                System.out.println(model);
            }

            System.out.println("------");

        }

    }
}
