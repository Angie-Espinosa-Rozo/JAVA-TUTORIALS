package Capitulo4_DeclaracionesFlujoControl.Tutorial13_While;

public class T13_Main_While {
    public static void main (String[] args){
       int Contador =1;
       while (Contador < 11) {
           System.out.println("La cuenta es:" + Contador);
           Contador++;
       }

       int Contador2 =1;
       do{
           System.out.println("La cuenta Dos es " +Contador2);
           Contador2++;
       } while (Contador2<11);
    }
}
