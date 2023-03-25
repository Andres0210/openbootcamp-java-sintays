package com.example;

public class Funciones {
    public static void main(String[] args) {

        System.out.println(getPrice(120000, 19));
        System.out.println(getPrice(190000, 16));
    }

    static double getPrice(int price, double iva) {
        return price + (price * (iva / 100));
    }

}
