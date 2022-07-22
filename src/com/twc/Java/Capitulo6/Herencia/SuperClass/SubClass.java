package com.twc.Java.Capitulo6.Herencia.SuperClass;

public class SubClass extends SuperClase{
    public void printMethod(){
        super.printMethod();
        System.out.println("Impreso en Subclase");
    }
    public static void main (String[] args){
        SubClass s =new SubClass();
        s.printMethod();
    }
}
