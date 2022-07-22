package com.twc.Java.Capitulo1.Clases;

public class MainBicicletas {
    public static void main(String[] args) {
        Bicicleta Bici1 = new Bicicleta();
        Bici1.changeCadence(50);
        Bici1.changeGear(2);
        Bici1.changeSpeedUP(10);
        Bici1.PrintStates();
    }
}
