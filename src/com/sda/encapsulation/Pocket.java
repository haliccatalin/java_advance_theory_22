package com.sda.encapsulation;

public class Pocket {
    private double money;

    public Pocket() {}

    public void setMoney(double money) {
        if(money < 0 || money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money!");
        } else {
            this.money = money;
        }
    }

    public double getMoney(double money) {
        if(this.money <= 10) {
            return 0;
        } else {
            return money;
        }
    }
}
