package com.twc.Java.Capitulo5.NestedClasses.InnerClass.Annonimous;

public class HelloWorldAnonymousClasses {
    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    public void SayHello() {
        class EnglisGreeting implements HelloWorld {
            String name = "World";

            @Override
            public void greet() {
                greetSomeone("World");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello" + name);
            }
        }
        HelloWorld EnglisGreeting = new EnglisGreeting();
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("salut" + name);
            }
        };
        HelloWorld SpanishGreeying = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("Mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola" + name);
            }
        };
        EnglisGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        SpanishGreeying.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.SayHello();
    }

}
