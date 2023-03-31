package com.example.ejercicioTema4;

public class SmartPhone extends SmartDevice{

    double pixCamera;

    public SmartPhone() {
    }

    public SmartPhone(double pulgadasPantalla, double mABateria, String color, double pixCamera) {
        super(pulgadasPantalla, mABateria, color);
        this.pixCamera = pixCamera;
    }
}
