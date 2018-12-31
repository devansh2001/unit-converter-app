package com.example.devanshjatinponda.unitconverter;

public enum Volume implements  PhysicalQuantity {
    GALLON(3.78541),
    LITRE(1),
    MILLILITRE(0.001),
    CUBICMETER(1000),
    CUBICINCH(0.01639),
    CUBICFOOT(28.31685);
    private double toStandard;

    @Override
    public double getToStandard() {
        return toStandard;
    }

    Volume(double toStandard) {
        this.toStandard = toStandard;
    }
}
