package com.sda.exercices.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Create and present the usage of lambda expressions:
 * a) Addition, subtraction, multiplication, division.
 * b) The sum of elements (int type) of the list.
 * homework
 * c) Number of words in the input expression (list containing elements of type
 * String).
 * d) * List before and after sorting (use the Arrays class and lambda expressions:
 * String :: compareToIgnoreCase as a comparator)
 */
public class Main {

    public static void main(String[] args) {
        // fara lambda expression
        Math addition = new Math() {
            @Override
            public double calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(addition.calculate(2, 3));

        // cu lambda expression
        Math additionLambda = (int a, int b) -> a + b;
        System.out.println("addition with Lambda: " + additionLambda.calculate(2,3));

        Math subtractionLambda = (a, b) -> a - b;
        System.out.println("subtraction: " + subtractionLambda.calculate(2,3));

        Math divisionLambda = (a, b) -> a / b;
        System.out.println("division: " + divisionLambda.calculate(6, 3));

        Math multiplicationLambda = (a, b) -> a * b;
        System.out.println("multiplication: " + multiplicationLambda.calculate(2, 4));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(53);
        numbers.add(100);
        numbers.add(20);
        numbers.add(10);

        int sum = 0;

        for(Integer number : numbers) {
            // fara lambda expression;
//            sum = sum + number;

            // cu lambda expression
            Math sumElement = (int sumLambda, int numberLambda) -> sumLambda + numberLambda;

//            (int) cast din double in int (double pentru ca metoda calculate returneaza double)
            sum = (int) sumElement.calculate(sum, number);
        }

        System.out.println("Sum with Lambda: " + sum);



    }
}
