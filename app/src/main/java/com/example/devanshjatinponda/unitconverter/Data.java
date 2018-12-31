package com.example.devanshjatinponda.unitconverter;

public enum Data implements PhysicalQuantity {
    BYTE(1),
    KILOBYTE(1024),
    MEGABYTE(1048576),
    GIGABYTE(1073741824);
    private double toStandard;

    @Override
    public double getToStandard() {
        return toStandard;
    }

    Data(double toStandard) {
        this.toStandard = toStandard;
    }
}
