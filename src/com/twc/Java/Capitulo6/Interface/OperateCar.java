package com.twc.Java.Capitulo6.Interface;

import com.sun.javafx.scene.traversal.Direction;

public interface OperateCar {
    int turn(Direction direccion,
             double radio,
             double startSpeed,
             double endSpeed);

    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);

    int signalTurn(Direction direction,
                   boolean signalOn);

    int getRadarFront(double distanceToCar,
                      double speedOfCar);

    int getRadarRear(double distanceToCar,
                     double speedOfCar);
}
