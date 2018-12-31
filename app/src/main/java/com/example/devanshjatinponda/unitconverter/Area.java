package com.example.devanshjatinponda.unitconverter;

public enum Area implements PhysicalQuantity {
    ACRE(4046.85642),
    HECTARE(10000),
    SQUARECENTIMETER(0.0001),
    SQAUREFOOT(0.0929),
    SQUAREINCH(0.00065),
    SQUAREMETER(1);

    private double toStandard;

    @Override
    public double getToStandard() {
        return toStandard;
    }

    Area(double toStandard) {
        this.toStandard = toStandard;
    }
}
