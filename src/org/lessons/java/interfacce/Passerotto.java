package org.lessons.java.interfacce;

public class Passerotto extends Animali implements Volatile{
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

    @Override
    public void vola() {
        System.out.println("Vola ed è piccolissimo");
    }
}
