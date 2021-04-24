package com.sda.enums;

public class Main {
    public static void main(String[] args) {
        LengthUnit lengthUnit = LengthUnit.INCH;

        switch (lengthUnit) {
            case CENTIMETER:
                System.out.println("centimetru");
                System.out.println(LengthUnit.CENTIMETER);
                break;
            case FOOT:
                System.out.println("picioare");
                System.out.println(LengthUnit.FOOT);

                break;
            case METER:
                System.out.println("metru");
                System.out.println(LengthUnit.METER);

                break;
            case INCH:
                System.out.println("inch");
//                System.out.println(LengthUnit.INCH.convertToMeter());

                break;
        }

        for(LengthUnit unit : LengthUnit.values()) {
            System.out.println(unit);
        }
    }
}
