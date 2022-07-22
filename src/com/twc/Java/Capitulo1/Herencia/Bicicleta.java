package com.twc.Java.Capitulo1.Herencia;

public class Bicicleta {
    int Cadence = 0;
    int Speed = 0;
    int gear = 0;

    void changeCadence(int newValue) {
        Cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void changeSpeedUP(int newValue) {
        Speed = newValue + Speed;
    }

    void applyBrakes(int decrement) {
        Speed = Speed - decrement;
    }

    void PrintStates() {
        System.out.println("Cadence:" + Cadence + "Speed:" + Speed + "Gear:" + gear);
    }
}
