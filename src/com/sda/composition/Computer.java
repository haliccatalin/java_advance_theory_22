package com.sda.composition;

public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }
}
