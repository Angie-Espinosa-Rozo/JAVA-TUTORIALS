package com.twc.Java.Capitulo5.NestedClasses;

public class TopLevelClass {
    void accessMembers(OuterClass outer) {
        System.out.println(outer.CampoExt);
        System.out.println(outer.CampoExtSt);
    }
}
