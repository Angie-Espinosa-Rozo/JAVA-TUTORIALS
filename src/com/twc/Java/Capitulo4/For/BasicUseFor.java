package com.twc.Java.Capitulo4.For;

public class BasicUseFor {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("El conteo es" + i);
        }
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : numero) {
            System.out.println("El recuento es" + j);
        }
    }
}
