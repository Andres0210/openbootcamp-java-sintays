package com.example.estructurascontrol;

public class ElseIf {
    public static void main(String[] args) {
        String dia = "Domingo";

        boolean resultado = dia.equals("Martes");

        if (dia.equals("Lunes")) {
            System.out.println("Es lunes che");
        } else if (dia.equals("Martes")) {
            System.out.println("Se metió el martes");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles media semana");
        } else if (dia.equals("Jueves")) {
            System.out.println("Juerves papá");
        } else if (dia.equals("Viernes")) {
            System.out.println("Nos juimos viernes!!!");
        } else if (dia.equals("Sabado")) {
            System.out.println("sabadete");
        } else if (dia.equals("Domingo")) {
            System.out.println("A dormir mañana madrugo");
        } else {
            System.out.println("habla bien ingresa un día válido");
        }
    }
}
