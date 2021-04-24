package com.sda.composition;

public class Mouse {
    private int buttonNumber;
    private int dpi;
    private String color;

    public Mouse(int buttonNumber, int dpi, String color) {
        this.buttonNumber = buttonNumber;
        this.dpi = dpi;
        this.color = color;
    }

    public int getButtonNumber() {
        return buttonNumber;
    }

    public void setButtonNumber(int buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
