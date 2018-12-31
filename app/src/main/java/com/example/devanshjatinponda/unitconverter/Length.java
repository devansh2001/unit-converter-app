package com.example.devanshjatinponda.unitconverter;

public enum Length implements PhysicalQuantity {
    MILLIMETER(0.001),
    CENTIMETER(0.01),
    METER(1),
    KILOMETER(1000),
    INCH(0.0254),
    FOOT(0.3048),
    YARD(0.9144),
    MILE(1609.344),
    NAUTICALMILE(1852);

    private double toStandard;
    Length(double toStandard) {
        this.toStandard = toStandard;
    }

    @Override
    public double getToStandard() {
        return toStandard;
    }
}
