package com.twc.Java.Capitulo5.Objects;

public class CreationObjects {
    public static void main(String[] args) {
        Point Punto = new Point(23, 94);
        Rectangulo Rect1 = new Rectangulo(100, 200, Punto);
        Rectangulo Rect2 = new Rectangulo(50, 100);
        System.out.println("Ancho de Rect1" + Rect1.ancho);
        System.out.println("Altura de Rect1" + Rect1.altura);
        System.out.println("Area de Rect1" + Rect1.getArea());
        Rect2.origin = Punto;
        System.out.println("Posicion X Rect2" + Rect2.origin.x);
        System.out.println("Posicion Y Rect2" + Rect2.origin.y);
        Rect2.move(40, 72);
        System.out.println("Posicion X Rect2" + Rect2.origin.x);
        System.out.println("Posicion Y Rect2" + Rect2.origin.y);
    }
}
