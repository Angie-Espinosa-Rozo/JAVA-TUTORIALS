package com.twc.Java.Capitulo5.Objects;

public class Rectangulo {
    public int ancho = 0;
    public int altura = 0;
    public Point origin;

    public Rectangulo() {
        origin = new Point(0, 0);
    }

    public Rectangulo(Point p) {
        origin = p;
    }

    public Rectangulo(int w, int h) {
        altura = h;
        ancho = w;
    }

    public Rectangulo(int w, int h, Point p) {
        ancho = w;
        altura = h;
        origin = p;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return ancho * altura;
    }
}
