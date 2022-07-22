package com.twc.Java.Capitulo4.Bifurcaciones;

public class ContinueComand {
    public static void main(String[] args) {
        String Searchme = "peter piper picked a" + "peck of pickled peppers";
        int max = Searchme.length();
        int numPS = 0;
        for (int i = 0; i < max; i++) {
            if (Searchme.charAt(i) != 'p')
                continue;
            numPS++;
        }
        System.out.println("Found " + numPS + " P's in the strings");

    }
}
