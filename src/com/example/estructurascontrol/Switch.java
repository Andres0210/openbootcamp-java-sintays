package com.example.estructurascontrol;

public class Switch {
    public static void main(String[] args) {
        String dia = "doingo";

        switch (dia) {
            case "Lunes":
                System.out.println("Es lunes");
                break;
            case "Martes":
                System.out.println("marrtes");
                break;
            case "Miercoles":
                System.out.println("Es miercoles");
                break;
            case "Jueves":
                System.out.println("Es jueves");
                break;
            case "Viernes":
                System.out.println("Es viernes");
                break;
            default:
                System.out.println("Finde");
                break;
        }
    }
}
