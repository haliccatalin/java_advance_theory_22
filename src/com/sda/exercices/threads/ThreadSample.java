package com.sda.exercices.threads;

public class ThreadSample implements Runnable {
    private int value;
    private boolean isActive = true;

    ThreadSample(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        while(isActive) {
//        while(true) {
            System.out.println("Hello " + this.value);

//            if (!isActive){
//                break;
//            }

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void stopThread() {
        this.isActive = false;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
