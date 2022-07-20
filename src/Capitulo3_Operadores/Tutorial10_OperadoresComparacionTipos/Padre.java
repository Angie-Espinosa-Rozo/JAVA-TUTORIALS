package Capitulo3_Operadores.Tutorial10_OperadoresComparacionTipos;

public class Padre {
    String Genero ="";
    int edad =0;

    void changeGenero(String Valor){
        Genero=Valor;
    }
    void changeEdad(int valor2){
        edad=valor2;
    }
    void PrintCosas (){
        System.out.println("Genero"+Genero+"Edad"+edad);
    }

}
