package com.twc.Java.Capitulo3.TypeCompationsOperators;

public class ExampleTypeComparationsOperator {
    public static void main(String[] args) {
        Padre obj1 = new Padre();
        Padre obj2 = new Hijo();

        System.out.println("obj1 instacia de padre"
                + (obj1 instanceof Padre));
        System.out.println("obj1 instacia de hijo"
                + (obj1 instanceof Hijo));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof My_interface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Padre));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Hijo));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof My_interface));
    }
}
