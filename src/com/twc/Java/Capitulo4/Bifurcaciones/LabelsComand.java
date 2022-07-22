package com.twc.Java.Capitulo4.Bifurcaciones;

public class LabelsComand {
    public static void main(String[] args) {
        int[][] arrayOfInt = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}};
        int busqueda = 12;
        boolean encontrado = false;
        int i;
        int j = 0;

        search:
        for (i = 0; i < arrayOfInt.length; i++) {
            for (j = 0; j < arrayOfInt[i].length; j++) {
                if (arrayOfInt[i][j] == busqueda) {
                    encontrado = true;
                    break search;
                }
            }
        }

        if (encontrado) {
            System.out.println("Encontrado " + busqueda + " index " + i + "," + j);
        } else {
            System.out.println("No encontrado");
        }
    }
}
