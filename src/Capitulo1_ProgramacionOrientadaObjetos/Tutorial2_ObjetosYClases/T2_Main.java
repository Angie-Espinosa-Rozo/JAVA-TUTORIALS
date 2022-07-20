package Capitulo1_ProgramacionOrientadaObjetos.Tutorial2_ObjetosYClases;

public class T2_Main {
    
    public static void main(String[] args){
        Bicicleta Bici1 = new Bicicleta();
        Bici1.changeCadence(50);
        Bici1.changeGear(2);
        Bici1.changeSpeedUP(10);
        Bici1.PrintStates();
    }
}
