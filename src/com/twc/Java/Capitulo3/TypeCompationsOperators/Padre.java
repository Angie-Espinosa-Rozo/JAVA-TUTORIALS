package com.twc.Java.Capitulo3.TypeCompationsOperators;

public class Padre {
    String Genero = "";
    int edad = 0;

    void changeGenero(String Valor) {
        Genero = Valor;
    }

    void changeEdad(int valor2) {
        edad = valor2;
    }

    void PrintCosas() {
        System.out.println("Genero" + Genero + "Edad" + edad);
    }

}
