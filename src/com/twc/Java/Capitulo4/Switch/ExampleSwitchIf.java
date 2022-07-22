package com.twc.Java.Capitulo4.Switch;

public class ExampleSwitchIf {
    public static int ObtenerNumeroMes(String mes) {
        int numeroMes = 0;

        if (mes == null) {
            return numeroMes;
        }
        switch (mes) {
            case "Enero":
                numeroMes = 1;
                break;
            case "Febrero":
                numeroMes = 2;
                break;
            case "Marzo":
                numeroMes = 3;
                break;
            case "Abril":
                numeroMes = 4;
                break;
            case "Mayo":
                numeroMes = 5;
                break;
            case "Junio":
                numeroMes = 6;
                break;
            case "Julio":
                numeroMes = 7;
                break;
            case "Agosto":
                numeroMes = 8;
                break;
            case "Septiembre":
                numeroMes = 9;
                break;
            case "Octubre":
                numeroMes = 10;
                break;
            case "Noviembre":
                numeroMes = 11;
                break;
            case "Diciembre":
                numeroMes = 12;
                break;
            default:
                numeroMes = 0;
                break;
        }
        return numeroMes;
    }

    public static void main(String[] args) {
        String mes = "Agosto";
        int MesRetornado = ExampleSwitchIf.ObtenerNumeroMes(mes);
        System.out.println(MesRetornado);
        if (MesRetornado == 0) {
            System.out.println("Mes invalido");
        } else {
            System.out.println(MesRetornado);
        }
    }
}
