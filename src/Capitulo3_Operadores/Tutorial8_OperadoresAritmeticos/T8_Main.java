package Capitulo3_Operadores.Tutorial8_OperadoresAritmeticos;

public class T8_Main {
    public static void main (String[] args){
        int resultado =1+2;
        System.out.println("1 + 2 = "+resultado);
        int resultado_original=resultado;

        resultado=resultado-1;
        System.out.println(resultado_original+"- 1  = "+resultado);
        resultado_original=resultado;

        resultado=resultado*2;
        System.out.println(resultado_original+"* 2  = "+resultado);
        resultado_original=resultado;

        resultado=resultado/2;
        System.out.println(resultado_original+"/ 2  = "+resultado);
        resultado_original=resultado;

        resultado=resultado+8;
        System.out.println(resultado_original+"+ 8  = "+resultado);
        resultado_original=resultado;

        resultado=resultado%7;
        System.out.println(resultado_original+"% 7  = "+resultado);

        String PrimeraCadena = "Esto es";
        String SegundaCadena = " una cadena concatenada";
        String terceraCadena = PrimeraCadena+SegundaCadena;
        System.out.println(terceraCadena);


    }
}
