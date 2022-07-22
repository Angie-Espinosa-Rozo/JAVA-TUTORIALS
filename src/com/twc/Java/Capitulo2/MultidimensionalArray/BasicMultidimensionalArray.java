package com.twc.Java.Capitulo2.MultidimensionalArray;

public class BasicMultidimensionalArray {
    public static void main(String[] args) {
        String[][] nombres = {{"Señor", "Señora", "Señorita"}, {"Smith", "jones"}};
        System.out.println(nombres[0][0] + " " + nombres[1][0]);
        System.out.println(nombres[0][1] + " " + nombres[1][1]);
        System.out.println(nombres.length);
    }

}
