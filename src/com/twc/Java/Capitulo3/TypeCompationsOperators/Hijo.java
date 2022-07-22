package com.twc.Java.Capitulo3.TypeCompationsOperators;

public class Hijo extends Padre implements My_interface {
    int otros = 0;
    int win = 1;

    @Override
    public void changeWindows(int NewValue) {
        win = NewValue;
    }

    void changeotro(int valor) {
        otros = valor;
    }

    void imprimir() {
        System.out.println(otros);
    }
}
