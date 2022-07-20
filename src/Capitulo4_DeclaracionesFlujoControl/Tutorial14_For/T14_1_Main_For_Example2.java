package Capitulo4_DeclaracionesFlujoControl.Tutorial14_For;

public class T14_1_Main_For_Example2 {
    public static void main(String[] args) {
        int[] arrayOfInt = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int busqueda = 12;
        boolean encontrado = false;
        int i;

        for (i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i]==busqueda){
                encontrado=true;
                break;
            }
        }

        if (encontrado){
            System.out.println("Encontrado "+ busqueda +" index " +i);
        }else {
            System.out.println("No encontrado");
        }
    }
}