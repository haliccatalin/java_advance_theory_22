package com.sda.inheritance;

public class Main {
    public static void main(String[] args) {
        ChildOne childOne = new ChildOne("Popescu Vasilica", "112", "F");
        System.out.println(childOne.toString());

//        childOne.printFields();

//        childOne.parentMethod();


        Parent parent = new Parent("Vasilica", "22131231");

        // Copilul stie tot ce stie parintele si ceva in plus.
        Parent parent1 = new ChildOne("Maricica", "0000000000000", "F");
//        Nu se poate pentru ca parintele are mai putine proprietati decat copilul.
//        ChildOne childOne1 = new Parent("Daniel", "3123123213123");
    }
}
