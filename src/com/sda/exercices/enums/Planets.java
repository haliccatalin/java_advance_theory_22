package com.sda.exercices.enums;

/**
 * Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets.
 */
public enum Planets {
    JUPITER("Jupiter", "Huge", "753.2 million km"),
    PLUTO("Pluto", "Small", "1253.2 million km"),
    SATURN("Saturn", "Huge", "553.2 million km"),
    MARTE("Marte", "Small", "453.2 million km");

    private String name;
    private String size;
    private String distance;

    Planets(String name, String size, String distance) {
        this.name = name;
        this.size = size;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.size + " " + this.name;
    }

    public String distanceFromEarth() {
        return "Distance from Earth: " + this.distance;
    }

    public String getDistance(Planets planet) {
        switch (planet) {
            case JUPITER:
                return "Distance from Earth: 753.2 million km";
            case MARTE:
                return "Distance from Earth: 453.2 million km";
            case PLUTO:
                return "Distance from Earth: 1253.2 million km";
            case SATURN:
                return "Distance from Earth: 553.2 million km";
            default:
                return "no planet is available";
        }
    }
}
