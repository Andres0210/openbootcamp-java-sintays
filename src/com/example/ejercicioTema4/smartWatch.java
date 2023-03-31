package com.example.ejercicioTema4;

public class smartWatch extends SmartDevice {
    boolean sensorOxigeno;

    public smartWatch() {
    }

    public smartWatch(double pulgadasPantalla, double mABateria, String color, boolean sensorOxigeno) {
        super(pulgadasPantalla, mABateria, color);
        this.sensorOxigeno = sensorOxigeno;
    }
}
