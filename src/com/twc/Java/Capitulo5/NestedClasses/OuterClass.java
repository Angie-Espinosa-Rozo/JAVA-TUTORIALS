package com.twc.Java.Capitulo5.NestedClasses;

public class OuterClass {
    String CampoExt = "Campo Exterior";
    static String CampoExtSt = "Campo exterior estatico";

    class ClaseInterior {
        void accesoMiembros() {
            System.out.println(CampoExt);
            System.out.println(CampoExtSt);
        }
    }

    static class StaticNestedClass {
        void AcessoMiembros(OuterClass outer) {
            //System.out.println(CampoExt);
            System.out.println(CampoExtSt);
        }
    }
}
