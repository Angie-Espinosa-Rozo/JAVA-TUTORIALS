package com.twc.Java.Capitulo5.NestedClasses.InnerClass;

public class DataStructure {
    private static final int TAMAÑO = 15;
    private int[] arraysInts = new int[TAMAÑO];

    public DataStructure() {
        for (int i = 0; i < TAMAÑO; i++) {
            arraysInts[i] = i;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex <= TAMAÑO - 1);
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arraysInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
