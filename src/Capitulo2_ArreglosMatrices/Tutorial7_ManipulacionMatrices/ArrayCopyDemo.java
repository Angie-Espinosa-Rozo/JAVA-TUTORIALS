package Capitulo2_ArreglosMatrices.Tutorial7_ManipulacionMatrices;

public class ArrayCopyDemo {
    public static void main (String[] args){
        String[] Mcopy ={"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marroquín", "Ristretto"};
        String[] CopyTo= java.util.Arrays.copyOfRange(Mcopy,2,9);
                for (String cafe:CopyTo){
                    System.out.print(cafe+" ");
                }
        System.out.println(java.util.Arrays.toString(CopyTo));
    }
}
