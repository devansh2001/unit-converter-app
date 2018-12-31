package com.example.devanshjatinponda.unitconverter;

public enum Mass implements PhysicalQuantity {
    POUND(0.45359),
    OUNCE(0.02835),
    KILOGRAM(1),
    GRAM(0.001);
    private double toStandard;
    Mass(double toStandard) {
        this.toStandard = toStandard;
    }
    @Override
    public double getToStandard() {
        return toStandard;
    }
}
