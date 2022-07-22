package com.twc.Java.Capitulo5.NumerationExpresion;

public class Numeration {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    Day day;

    public Numeration(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        Numeration firstDay = new Numeration(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Numeration thirdDay = new Numeration(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Numeration fifthDay = new Numeration(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Numeration sixthDay = new Numeration(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Numeration seventhDay = new Numeration(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
