package com.twc.Java.Capitulo4.Switch;

public class MultipleCaseLabels {
    public static void main(String[] args) {
        int mes = 2;
        int año = 2000;
        int numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (((año % 4 == 0) && !(año % 100 == 0)) || (año % 400 == 0))
                    numDias = 29;
                else
                    numDias = 28;
                break;
            default:
                System.out.println("mes invalido");
                break;
        }
        System.out.println("Numero de dias = " + numDias);
    }
}
