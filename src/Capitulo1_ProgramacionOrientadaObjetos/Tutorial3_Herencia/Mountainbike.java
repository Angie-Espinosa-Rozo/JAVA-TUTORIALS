package Capitulo1_ProgramacionOrientadaObjetos.Tutorial3_Herencia;


public class Mountainbike extends Bicicleta{
    int Otro=0;
    void ChangeOtro(int Value){
        Otro=Value;
    }
    void  ImprimirDos () {
        System.out.println("Esto cambio"+Otro);
    }

}