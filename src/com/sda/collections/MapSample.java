package com.sda.collections;

import com.sda.abstractization.Angajat;
import com.sda.encapsulation.Person;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {

//        1. Map are 2 parametri, key, value
//        2. key -> este unic, daca incercam sa adaugam acelasi key in map, va suprascrie valoarea celei prezente
//        3. ordinea este aleatorie
//        4. folosim get(key) pentru a accesa valoarea din MAP
//        5. se recomanda folosirea lui contains inainte sa adaugam un element nou
//        6. pentru a sterge un element folosim remove(key)
        Map<String, String> dictionary = new HashMap<>();

        // map => key, value
        // put -> este folosit pentru a adauga un element in MAP
        dictionary.put("java", "este un limbaj de programare");
        dictionary.put("cartof", "este o leguma, care sta la baza KFC, McDonalds, adus din America");
        dictionary.put("tastatura", "ne ajuta sa folosim Desktop, Laptop etc");

        // contains -> verifica daca key-ul este prezent in MAP, evitam astfel suprascrierea
        if(dictionary.containsKey("mouse")) {
            System.out.println("KEY-ul este prezent");
        } else {
            dictionary.put("mouse", "ne ajuta sa folosim Desktop, Laptop etc");
        }

        // daca KEY-ul este prezent in MAP atunci ii suprascrie valoarea
        dictionary.put("java", "ATENTIE!!! nu este un limbaj de programare");

        // get -> va returna valoarea lui KEY
        String valueFromKey = dictionary.get("cartof");
        System.out.println("Cartof: " + valueFromKey);

        // remove -> va sterge KEY-ul si valoarea din MAP
        dictionary.remove("cartof");

        for (Map.Entry<String, String> itemDictionary : dictionary.entrySet()) {
            String key = itemDictionary.getKey();
            String value = itemDictionary.getValue();

            System.out.println("Key: " + key + " -> " + value);
        }


    }

    public static void exAB() {
        Map<String, String> studentsMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if(name.equals("stop")) {
                break;
            }
            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            if(surname.equals("stop")) {
                break;
            }

            studentsMap.put(name, surname);
        }

        printMap(studentsMap);

    }

    public static void exC() {
        Map<String, List<String>> friends = new HashMap<>();

        List<String> popescuFriends = new ArrayList<>();
        popescuFriends.add("Ion");
        popescuFriends.add("Mihai");
        popescuFriends.add("Maria");

        friends.put("popescu", popescuFriends);

        List<String> ionescuFriends = new ArrayList<>();
        ionescuFriends.add("Mircea");
        ionescuFriends.add("Ilie");

        friends.put("ionescu", ionescuFriends);

        for(Map.Entry<String, List<String>> friendEntry : friends.entrySet()) {
            System.out.println(friendEntry.getKey());

            List<String> names = friendEntry.getValue();

            for(String name : names) {
                System.out.println(" - " + name);
            }
        }

        Map<String, Map<String, Integer>> maps = new HashMap<>();

        Map<String, Integer> integerMap = new HashMap<>();

        maps.put("key", integerMap);
    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> itemDictionary : map.entrySet()) {
            String key = itemDictionary.getKey();
            String value = itemDictionary.getValue();

            System.out.println("Key: " + key + " -> " + value);
        }
    }
}
