package com.twc.Java.Capitulo7.Characters;

public class FileNameMain {
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileName myHomePage = new FileName(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}
