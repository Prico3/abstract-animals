package org.lessons.java.interfacce;

public class Aquila extends Animali implements Volatile {
    @Override
    void dormi() {
        System.out.println("zzzz");
    }

    @Override
    void verso() {
        System.out.println("ahhhhhahhhhh");
    }

    @Override
    void mangia() {
        System.out.println("Prometeo");
    }

    @Override
    public void vola() {
        System.out.println("guarda come vola l'aquila");
    }
}
