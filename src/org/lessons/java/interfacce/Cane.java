package org.lessons.java.interfacce;

public class Cane extends Animali {

    @Override
    void dormi() {
        System.out.println("Zzzzz");
    }

    @Override
    void verso() {
        System.out.println("bau bau");
    }

    @Override
    void mangia() {
        System.out.println("Le ciabatte/scarpe");
    }
}
