package Capitulo3_Operadores.Tutorial9_OperadoresIgualdadRelacionales;

public class T9_1_OperadoresCondicionales {
    public static void main (String[] args){
        int valor1=1;
        int valor2=2;
        int resultado;
        boolean wenseslado =false;
        if ((valor1==1)&&(valor2==2))
            System.out.println("Valor 1 es 1 y valor dos es 2");
        if ((valor1==1)||(valor2==2))
            System.out.println("Valor 1 es 1 o valor dos es 2");
        resultado = wenseslado ? valor1:valor2; // si wenseslado es tru resultado es igual a valor1 si es false es igual a valor2
        System.out.println(resultado);

    }
}
