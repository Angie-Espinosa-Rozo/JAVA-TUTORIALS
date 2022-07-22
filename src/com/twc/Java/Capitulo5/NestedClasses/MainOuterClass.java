package com.twc.Java.Capitulo5.NestedClasses;

public class MainOuterClass {
    public static void main(String[] args) {
        System.out.println("Inner clas: ");
        System.out.println("------------");
        OuterClass OuterObject = new OuterClass();
        OuterClass.ClaseInterior innerObject = OuterObject.new ClaseInterior();
        innerObject.accesoMiembros();
        System.out.println("\nStatic nested class");
        System.out.println("-----------");
        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
        staticNestedObject.AcessoMiembros(OuterObject);
        System.out.println("\nTop-levl class:");
        System.out.println("----------");
        TopLevelClass toplevelObjeto = new TopLevelClass();
        toplevelObjeto.accessMembers(OuterObject);
    }
}
