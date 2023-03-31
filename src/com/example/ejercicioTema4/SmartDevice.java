package com.example.ejercicioTema4;

public abstract class SmartDevice {
    double pulgadasPantalla;
    double mABateria;
    String color;

    public SmartDevice() {
    }

    public SmartDevice(double pulgadasPantalla, double mABateria, String color) {
        this.pulgadasPantalla = pulgadasPantalla;
        this.mABateria = mABateria;
        this.color = color;
    }
}
