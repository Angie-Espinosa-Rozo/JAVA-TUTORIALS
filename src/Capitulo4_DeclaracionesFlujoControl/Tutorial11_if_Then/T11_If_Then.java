package Capitulo4_DeclaracionesFlujoControl.Tutorial11_if_Then;

public class T11_If_Then {
    public static void main(String[] args) {
        int Puntaje = 76;
        char grade;

        if (Puntaje >= 90)
            grade = 'A';
        else if (Puntaje >= 80)
            grade = 'B';
        else if (Puntaje >= 70)
            grade = 'C';
        else if (Puntaje >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("El grado es: "+grade);
    }
}
