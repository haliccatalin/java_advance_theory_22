package com.sda.composition;

public class Monitor {
    private double resolution;

    Monitor(double resolution){
        this.resolution = resolution;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
}
