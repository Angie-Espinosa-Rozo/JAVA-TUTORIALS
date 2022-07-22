package com.twc.Java.Capitulo4.Bifurcaciones;

public class BreakContinueComand {
    public static void main(String[] args) {
        String Searchme = "Buscar una subcadena en mi";
        String Subcadena = "sub";
        boolean encontrado = false;

        int max = Searchme.length() - Subcadena.length();
        Prueba:
        for (int i = 0; i <= max; i++) {
            int n = Subcadena.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (Searchme.charAt(j++) != Subcadena.charAt(k++)) {
                    continue Prueba;
                }
            }
            encontrado = true;
            break Prueba;
        }
        System.out.println(encontrado ? "lo encontre" : "No lo encontre");
    }
}
