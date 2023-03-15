package org.lessons.java.interfacce;

public class Delfino extends Animali implements AnimaleMarino {
    @Override
    void dormi() {
        System.out.println("zzzz");
    }

    @Override
    void verso() {
        System.out.println("bhoooooo");
    }

    @Override
    void mangia() {
        System.out.println("bontà");
    }

    @Override
    public void nuota() {
        System.out.println("nuota ed è molto bello");
    }
}
