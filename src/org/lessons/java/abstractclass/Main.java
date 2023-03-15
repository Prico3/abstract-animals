package org.lessons.java.abstractclass;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        Cane fido = new Cane();
        fido.dormi();
        fido.mangia();
        fido.verso();
        System.out.println("---------------");
        Passerotto pettorosso = new Passerotto();
        pettorosso.dormi();
        pettorosso.mangia();
        pettorosso.verso();
        System.out.println("---------------");
        Aquila furia = new Aquila();
        furia.dormi();
        furia.mangia();
        furia.verso();
        System.out.println("---------------");
        Delfino curioso = new Delfino();
        curioso.dormi();
        curioso.mangia();
        curioso.verso();
    }
}