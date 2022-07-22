package com.twc.Java.Capitulo6.Interface;

import com.sun.javafx.scene.traversal.Direction;

public class OperateBMW760 implements OperateCar{
    @Override
    public int signalTurn(Direction direction, boolean signalOn) {
        return 0;
    }

    @Override
    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    @Override
    public int turn(Direction direccion, double radio, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }
}