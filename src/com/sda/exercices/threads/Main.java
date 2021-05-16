package com.sda.exercices.threads;

/**
 * Create a class implementing the Runnable interface (implementing the run method):
 * a) Inside the run method display „Hello!”
 * b) Create a class object.
 * c) Start the thread receiving the created object as a parameter
 * (new Thread (<object>).start ())
 * d) Create several objects, run a separate thread for each of them.
 * e) Add the constructor to the created class, that accepts the int value.
 * f) For the displayed data inside the run method, add the received value (Hello + value).
 * g) Add a method to the class that will modify the int value.
 * h) Add a while loop to the run method, inside which it will print the modified
 * int value every few seconds.
 * i) Add the ability to disable (gracefully shutdown) the thread. Why shouldn’t we just „kill”
 * the thread?
 */
public class Main {
    public static void main(String[] args) {
        ThreadSample threadSample = new ThreadSample(43);
        // atunci cand folosim interfata Runnable, pentru a porni un thread
        // avem nevoie de un obiect din clasa Thread
        Thread thread = new Thread(threadSample);
        thread.start();
        threadSample.setValue(312);

        ThreadSample threadSample1 = new ThreadSample(54);
        Thread thread1 = new Thread(threadSample1);
        thread1.start();

        ThreadSample threadSample2 = new ThreadSample(2);
        Thread thread2 = new Thread(threadSample2);
        thread2.start();

        ThreadSample threadSample3 = new ThreadSample(8);
        Thread thread3 = new Thread(threadSample3);
        thread3.start();

        try {
            Thread.sleep(1000 * 20);

            threadSample.stopThread();
            threadSample2.stopThread();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
