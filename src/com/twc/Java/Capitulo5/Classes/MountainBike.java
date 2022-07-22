package com.twc.Java.Capitulo5.Classes;

public class MountainBike extends Bicicleta {
    public int seatHeight;

    public MountainBike(int startHeight, int starCadence,int startgear, int startSpeed){
        super(starCadence, startgear, startSpeed);
        seatHeight=startHeight;
    }
    public void setHeight(int newvalue){
        seatHeight=newvalue;
    }
}
