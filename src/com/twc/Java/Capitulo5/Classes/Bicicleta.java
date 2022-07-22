package com.twc.Java.Capitulo5.Classes;

public class Bicicleta {
    public int cadencia;
    public int gear;
    public int Speed;
    private int id;
    //private static final PI =3.14;
    private static int NumeroBici = 0;

    // Static se usa para variables unicamente del constructor o que le pertenece o es propio de cada objeto
    public Bicicleta(int startCadencia, int startSpeed, int startgear) {
        cadencia = startCadencia;
        gear = startgear;
        Speed = startSpeed;
        id = NumeroBici++;
    }

    public static int getNumeroBici() {
        return NumeroBici;
    }

    public void setCadencia(int NewValue) {
        cadencia = NewValue;
    }

    public void setGear(int NewValor) {
        gear = NewValor;
    }

    public void applyBrake(int NewValor) {
        Speed -= NewValor;
    }

    public void SpeedUp(int increment) {
        Speed += increment;
    }
}
