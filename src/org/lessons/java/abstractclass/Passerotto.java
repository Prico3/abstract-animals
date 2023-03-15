package org.lessons.java.abstractclass;

public class Passerotto extends Animali{
    @Override
    void dormi() {
        System.out.println("zzzzz");
    }

    @Override
    void verso() {
        System.out.println("cip cip");
    }

    @Override
    void mangia() {
        System.out.println("Cosa mangia un passerotto?");
    }
}
