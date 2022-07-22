package com.twc.Java.Capitulo1.Herencia;


public class Mountainbike extends Bicicleta {
    int Otro = 0;

    void ChangeOtro(int Value) {
        Otro = Value;
    }

    void ImprimirDos() {
        System.out.println("Esto cambio" + Otro);
    }

}