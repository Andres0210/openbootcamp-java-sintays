package com.example.estructurascontrol;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] cadena = {"Hola", "estoy", "concatenando", "Textos"};
        String resultado = "";
        for (int i = 0; i < cadena.length; i++){
            resultado += cadena[i] + " ";
        }
        System.out.println(resultado);
    }
}
